<div align="center">

# **Hash**

데이터를 고정된 크기의 고유한 값으로 변환하는 방법
빠른 검색 O(1), 중복 검사, 데이터 그룹핑, 캐싱 

[해시 함수](#해시-함수hash-function) • [해시 테이블](#해시-테이블) • [HashMap](#hashmap) • [HashSet](#hashset) • [LinkedHashMap](#linkedhashmap) • [TreeMap](#treemap)

</div>

## 해시 함수(Hash Function)

`임의의 크기의 데이터를 고정된 크기의 값으로 변환하는 함수`

1. 같은 입력은 항상 같은 출력을 생성
2. 해시 계산은 매우 빠름(긴 데이터도 빠르게 계산)
3. 해시 값이 고르게 분포
4. 입력 크기와 관계없이 출력 크기 일정(고정 크기 출력, 모든 해시값은 int 타입(4바이트))
5. 한 글자만 달라도 해시값이 완전히 달라짐

### hashCode() 메소드

`모든 Java 객체는 Object 클래스로부터 hashCode() 메소드를 상속받음`

```java
// 기본 타입
// Integer: 값 자체를 반환
Integer int1 = 100;
System.out.println(int1, int1.hashCode());

// Boolean: true는 1231, false는 1237
Boolean bool1 = true;
Boolean bool2 = false;
System.out.println(bool1, bool1.hashCode(), bool2, bool2.hashCode());

// Double: 비트 연산 사용
Double double1 = 3.14;
System.out.println(double1, double1.hashCode());

// Character: 문자의 유니코드 값
Character char1 = 'A';
System.out.println(char1, char1.hashCode());

// String
String str = "abc";
// 소수 31을 사용한 계산
int hash = 0;
int n = str.length();
for (int i = 0; i < n; i++) {
    char c = str.charAt(i);
    hash = 31 * hash + c;
}

// 일반 객체
// 기본 Object의 메모리 주소 기반 해시값 사용
```

### equals(), hashCode()

1. equals()가 true면 hashCode()도 같아야 함
2. hashCode()가 같아도 equals()는 false일 수 있음
3. equals()가 false여도 hashCode()는 같을 수 있음

## 해시 테이블

`키와 값을 함께 저장해 둔 데이터 구조`

### 배열 vs 해시 테이블

배열: 순차 저장, 순차 검색
해시 테이블: 해시 기반 저장, key로 접근

### 구조

`버킷(Bucket): 배열의 각 인덱스 위치`
`엔트리(Entry): 해시 테이블에 실제로 저장되는 하나의 데이터 단위`

키를 버킷 인덱스로 변환

```
10개의 버킷 배열, 4개의 엔트리(Key-Value 쌍을 저장하는 객체, next 포인터)        
┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐            
│ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ - 인덱스         
├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤               
│   │   │ C │ B │   │   │   │ A │   │ E │ - 데이터              
└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘            
```

### 해시 충돌

`서로 다른 키가 같은 해시값을 가지는 현상`

```
비둘기집 원리
 - 가능한 키의 수 > 버킷의 수
생일 패러독스
 - 23명만 있어도 생일 같을 확률 50%
```

## HashMap

`키-값(key-value)으로 데이터를 저장하는 자료구조(순서 보장 X)`

```java
// HashMap, Map
import java.util.*;

// HashMap 생성: key: String, value: Integer
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> hashMap = new HashMap<>(17); // 초기 용량 지정
Map<String, Integer> hashMap = new HashMap<>(map); // 다른 map 복사

// 추가/수정
hashMap.put("A", 1);
hashMap.put("A", 2);  // 덮어쓰기
hashmap.putAll(tempMap); // 다른 map 객체 복사
hashmap.putIfAbsent("B", 500); // 키가 없을 때만 추가(null 반환, 키 있을 경우 값(500) 반환)
hashMap.replace("A", 11); // 키가 있을 때만 값 변경(있으면 기존값 반환 후 변경, 없으면 null 반환)
hashmap.replace("A", 11, 30); // 값이 일치할 때만 변경(true, false) 
hashmap.compute("A", (key, oldVal) -> oldVal != null ? oldVal + 50 : 50);  // 새 값 게산
hashmap.computeIfAbsent("B", key -> key.length() * 100); // 키가 없을때만 계산
hashmap.computeIfPresent("A", (key, val) -> val * 2); // 키가 있을때만 계산
hashmap.merge("A", 100, (oldVal, newVal) -> oldVal + newVal); // 기존 값과 새 값 병합

// 조회
hashMap.get("A");
hashMap.containsKey("B"); // 키 존재 확인(true, false)
hashMap.containsValue(95); // 값 존재 확인(true, false)
hashMap.getOrDefault("David", 0); // 키 없으면 기본값 반환

// 삭제
hashMap.remove("A"); // 반환 후 삭제
hashMap.remove("A", 2); // 키-값이 일치할 때만 삭제, true면 삭제
hashMap.clear(); // 모든 데이터 삭제

// 반복문
for(String name : hashMap.keySet()) { ... } // 키
for(Integer score : hashMap.values()) { ... } // 값
for(Map.Entry<String, Integer> entry : hashMap.entrySet()) { 
  // entry.getKey(), entry.getValue() (키-값)
}
hashMap.forEach((name, score) -> {
    // name, score (키-값)
});

// 크기/상태 확인
hashMap.size(); // 크기 반환
hashMap.isEmpty(); // 비어있는지 확인
```

## HashSet

`중복을 허용하지 않는 집합(Set)을 구현한 자료구조(HashMap을 내부적으로 사용, 순서 보장 X)`

```java
// HashSet, Set
import java.util.*;

// HashSet 생성
HashSet<String> hashset = new HashSet<>();
Set<String> hashset = new HashSet<>();
Set<String> hashset = new HashSet<>(20); // 초기 용량 지정
List<String> list = Arrays.asList("a", "b", "a");
Set<String> hashset = new HashSet<>(list); // 컬렉션에서 생성(중복 제거됨)

// 추가
hashset.add("a"); // 성공시 true, 중복시 false 반환
hashset.add("c"); 
hashset.addAll(Arrays.asList("a", "b", "c")); // 여러 값 한번에 추가

// 조회
hashset.contains("a"); // 요소 존재 확인(true, false)
hashset.containsAll(Arrays.asList("a", "b")); // 모든 요소 존재 확인(true, false)

// 삭제
hashset.remove("a"); // 특정 요소 삭제(true, false)
hashset.removeAll(Arrays.asList("a", "b")); // 여러 요소 삭제(차집합)
hashset.removeIf(s -> s.startsWith("a")); // 조건에 맞는 요소 삭제
hashset.retainAll(Arrays.asList("b", "c")); // 지정된 요소만 유지(교집합)
hashset.clear(); // 모든 요소 삭제

// 반복문
for(String str : hashset) { ... } // for-each문
Iterator<String> iterator = hashset.iterator(); // Iterator 사용
while(iterator.hasNext()) {
    String str = iterator.next();
    // iterator.remove(); // 안전한 삭제
}
hashset.forEach(str -> {
    // str 처리
});

// 크기/상태 확인
hashset.size(); // 요소 개수 반환
hashset.isEmpty(); // 비어있는지 확인(true, false)

// 변환
Object[] arr = hashset.toArray(); // Object 배열로 변환
String[] strArr = hashset.toArray(new String[0]); // String 배열로 변환
```

## LinkedHashMap

`HashMap의 빠른 성능과 LinkedList의 순서 보장을 결합한 자료구조(순서 보장 O)`

```java
/// LinkedHashMap, Map
import java.util.*;

// LinkedHashMap 생성 key: String, value: Integer
Map<String, Integer> linkedhashmap = new LinkedHashMap<>();
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(16); // 초기 용량 지정
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(16, 0.75f); // 초기 용량, 로드 팩터
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(16, 0.75f, true); // 접근 순서 모드
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(map); // 다른 map 복사

// 추가/수정
linkedhashmap.put("A", 1); // 순서대로 추가
linkedhashmap.put("A", 2); // 덮어쓰기(순서는 그대로)
linkedhashmap.putAll(map); // 다른 map 객체 복사
linkedhashmap.putIfAbsent("B", 500); // 키가 없을 때만 추가
linkedhashmap.replace("A", 11); // 키가 있을 때만 값 변경
linkedhashmap.replace("A", 11, 30); // 값이 일치할 때만 변경(true, false)
linkedhashmap.compute("A", (key, oldVal) -> oldVal != null ? oldVal + 50 : 50); // 새 값 계산
linkedhashmap.computeIfAbsent("B", key -> key.length() * 100); // 키가 없을때만 계산
linkedhashmap.computeIfPresent("A", (key, val) -> val * 2); // 키가 있을때만 계산
linkedhashmap.merge("A", 100, (oldVal, newVal) -> oldVal + newVal); // 기존 값과 새 값 병합

// 조회
linkedhashmap.get("A"); // 접근 순서 모드에서는 순서 변경됨
linkedhashmap.containsKey("B"); // 키 존재 확인(true, false)
linkedhashmap.containsValue(95); // 값 존재 확인(true, false)
linkedhashmap.getOrDefault("C", 0); // 키 없으면 기본값 반환

// 삭제
linkedhashmap.remove("A"); // 반환 후 삭제
linkedhashmap.remove("A", 2); // 키-값이 일치할 때만 삭제(true, false)
linkedhashmap.clear(); // 모든 데이터 삭제

// 반복문(순서가 보장됨)
for(String name : linkedhashmap.keySet()) { ... } // 키
for(Integer score : linkedhashmap.values()) { ... } // 값
for(Map.Entry<String, Integer> entry : linkedhashmap.entrySet()) { 
  // entry.getKey(), entry.getValue() (키-값)
}
linkedhashmap.forEach((name, score) -> {
    // name, score (키-값)
});

// 크기/상태 확인
linkedhashmap.size(); // size(): 크기 반환
linkedhashmap.isEmpty(); // isEmpty(): 비어있는지 확인
```

## TreeMap

`레드-블랙 트리 기반, 키를 정렬된 순서로 저장하는 자료구조(정렬 보장 O)`

```java
// TreeMap, NavigableMap, SortedMap
import java.util.*;

// TreeMap 생성: key: String, value: Integer
TreeMap<String, Integer> treemap = new TreeMap<>(); // 기본 정렬(오름차순)
TreeMap<String, Integer> treemap = new TreeMap<>(Collections.reverseOrder()); // 내림차순
TreeMap<String, Integer> treemap = new TreeMap<>((a, b) -> b.compareTo(a)); // Comparator 지정
TreeMap<String, Integer> treemap = new TreeMap<>(sortedMap); // 정렬된 맵에서 생성

// 추가/수정 (자동 정렬)
treemap.put("C", 1); // 키 기준 자동 정렬
treemap.put("A", 2); // A가 C보다 앞에 정렬됨
treemap.putAll(tempMap); // 다른 map 객체 복사(자동 정렬)
treemap.putIfAbsent("B", 500); // 키가 없을 때만 추가
treemap.replace("A", 11); // 키가 있을 때만 값 변경
treemap.replace("A", 11, 30); // 값이 일치할 때만 변경(true, false)
treemap.compute("A", (key, oldVal) -> oldVal != null ? oldVal + 50 : 50); // 새 값 계산
treemap.computeIfAbsent("D", key -> key.length() * 100); // 키가 없을때만 계산
treemap.computeIfPresent("A", (key, val) -> val * 2); // 키가 있을때만 계산
treemap.merge("A", 100, (oldVal, newVal) -> oldVal + newVal); // 기존 값과 새 값 병합

// 조회
treemap.get("A"); // 값 반환
treemap.containsKey("B"); // 키 존재 확인(true, false)
treemap.containsValue(95); // 값 존재 확인(true, false)
treemap.getOrDefault("F", 0); // 키 없으면 기본값 반환

// 정렬 관련 조회
treemap.firstKey(); // 가장 작은 키
treemap.lastKey(); // 가장 큰 키
treemap.firstEntry(); // 가장 작은 엔트리(Map.Entry)
treemap.lastEntry(); // 가장 큰 엔트리(Map.Entry)
treemap.lowerKey("C"); // C보다 작은 가장 큰 키
treemap.higherKey("C"); // C보다 큰 가장 작은 키
treemap.floorKey("C"); // C 이하 가장 큰 키(C 포함)
treemap.ceilingKey("C"); // C 이상 가장 작은 키(C 포함)
treemap.lowerEntry("C"); // C보다 작은 가장 큰 엔트리
treemap.higherEntry("C"); // C보다 큰 가장 작은 엔트리
treemap.floorEntry("C"); // C 이하 가장 큰 엔트리
treemap.ceilingEntry("C"); // C 이상 가장 작은 엔트리

// 부분 맵 조회
treemap.subMap("B", "D"); // B(포함) ~ D(미포함) 부분 맵
treemap.subMap("B", true, "D", true); // B(포함) ~ D(포함) 부분 맵
treemap.headMap("C"); // 처음 ~ C(미포함) 부분 맵
treemap.headMap("C", true); // 처음 ~ C(포함) 부분 맵
treemap.tailMap("C"); // C(포함) ~ 끝 부분 맵
treemap.tailMap("C", false); // C(미포함) ~ 끝 부분 맵

// 삭제
treemap.remove("A"); // 반환 후 삭제
treemap.remove("A", 2); // 키-값이 일치할 때만 삭제(true, false)
treemap.pollFirstEntry(); // 가장 작은 엔트리 제거 후 반환
treemap.pollLastEntry(); // 가장 큰 엔트리 제거 후 반환
treemap.clear(); // 모든 데이터 삭제

// 반복문(정렬된 순서)
for(String name : treemap.keySet()) { ... } // 키 
for(Integer score : treemap.values()) { ... } // 값
for(Map.Entry<String, Integer> entry : treemap.entrySet()) { 
  // entry.getKey(), entry.getValue() (정렬 순서)
}
treemap.forEach((name, score) -> {
    // name, score (키-값)
});

// 역순 순회
for(String name : treemap.descendingKeySet()) { ... } // 역순 키
NavigableMap<String, Integer> descMap = treemap.descendingMap(); // 역순 맵
for(Map.Entry<String, Integer> entry : descMap.entrySet()) { ... }

// 크기/상태 확인
treemap.size(); // 크기 반환
treemap.isEmpty(); // 비어있는지 확인
```
## 비교

| 자료구조 | 순서 | 정렬 | 중복 | 시간복잡도 | 특징 |
|---------|------|------|------|-----------|------|
| HashMap | X | X | 키X/값O | O(1) | 가장 빠른 키-값 저장 |
| HashSet | X | X | X | O(1) | 중복 제거에 최적 |
| LinkedHashMap | O | X | 키X/값O | O(1) | 삽입 순서 유지 |
| TreeMap | O | O | 키X/값O | O(log n) | 자동 정렬, 범위 검색 |
