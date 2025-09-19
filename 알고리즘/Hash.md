<div align="center">

# **Hash**

데이터를 고정된 크기의 고유한 값으로 변환하는 방법
빠른 검색 O(1), 중복 검사, 데이터 그룹핑, 캐싱 



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

10개의 버킷 배열, 4개의 엔트리(Key-Value 쌍을 저장하는 객체, next 포인터)
┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐
│ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ - 인덱스
├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤
│   │   │ C │ B │   │   │   │ A │   │ E │ - 데이터
└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘

### 해시 충돌

`서로 다른 키가 같은 해시값을 가지는 현상`

```
비둘기집 원리
 - 가능한 키의 수 > 버킷의 수
생일 패러독스
 - 23명만 있어도 생일 같을 확률 50%
```

## HashMap

`키-값(key-value) 쌍으로 데이터를 저장하는 자료구조`

```java
// HashMap, Map
import java.util.*;

// HashMap 생성: key: String, value: Integer
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> hashMap = new HashMap<>(17); // 초기 용량 지정
Map<String, Integer> hashMap = new HashMap<>(map); // 다른 map에서 생성

// 추가
hashMap.put("A", 1);
hashMap.put("b", 77);

// 수정
hashMap.put("A", 2);  // 덮어쓰기
hashMap.replace("b", 11);

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

// 조건부 연산
hashMap.putIfAbsent("c", 90); // putIfAbsent(): 키가 없을 때만 추가
hashMap.compute("C", (key, oldValue) -> oldValue != null ? oldValue + 5 : 5); // compute(): 키에 대해 새 값 계산
hashMap.merge("A", 10, Integer::sum); // merge(): 기존 값과 새 값을 합치기(기존 값에 10 더하기)

// 크기/상태 확인
hashMap.size(); // 크기 반환
hashMap.isEmpty(); // 비어있는지 확인
```

## HashSet

`중복을 허용하지 않는 집합(Set)을 구현한 자료구조(HashMap을 내부적으로 사용)`

```java
// HashSet, Set
import java.util.*;

// HashSet 생성
HashSet<String> hashset = new HashSet<>();
Set<String> hashset = new HashSet<>();
Set<String> hashset = new HashSet<>(20); // 초기 용량 지정
List<String> list = Arrays.asList("a", "b", "a");
Set<String> hashset = new HashSet<>(list); // 중복 제거됨

// 추가
hashset.add("a"); // 성공시 true, 중복시 false 반환
hashset.add("c"); 
hashset.addAll(Arrays.asList("a", "b", "c")); // 여러 값 한번에 추가

// 조회/확인
hashset.contains("a"); // contains(): 요소 존재 확인(true, false)
hashset.containsAll(Arrays.asList("a", "b")); // containsAll(): 모든 요소 존재 확인(true, false)
hashset.isEmpty(); // isEmpty(): 비어있는지 확인(true, false)
hashset.size(); // size(): 크기 반환

// 삭제
hashset.remove("a"); // remove(): 특정 요소 삭제(true, false)
hashset.removeAll(Arrays.asList("a", "b")); // removeAll(): 여러 요소 삭제
hashset.retainAll(Arrays.asList("b", "c")); // retainAll(): 지정된 요소만 유지(교집합)
hashset.clear(); // clear(): 모든 요소 삭제

// 반복문
for(String str : hashset) { ... } // for문
Iterator<String> iterator = hashset.iterator(); // Iterator 사용
while(iterator.hasNext()) {
    String str = iterator.next();
    // iterator.remove(); // 안전한 삭제
}
```

## LinkedHashMap

`HashMap의 빠른 성능과 LinkedList의 순서 보장을 결합한 자료구조(삽입 순서 또는 접근 순서를 유지하는 해시맵)`

```java
/// LinkedHashMap, Map
import java.util.*;

// LinkedHashMap 생성 key: String, value: Integer
Map<String, Integer> linkedhashmap = new LinkedHashMap<>();
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(10); // 초기 용량 지정
Map<String, Integer> linkedhashmap = new LinkedHashMap<>(16, 0.75f, true); // 로드 팩터와 접근 순서 지정

// 추가/수정
linkedhashmap.put("a", 1); // 순서대로 추가
linkedhashmap.put("b", 56);
linkedhashmap.put("b", 6); // 기존 값 수정(순서는 그대로)

// 조회
linkedhashmap.get("a"); // 없으면 null 
linkedhashmap.getOrDefault("c", 0); // getOrDefault(): 없으면 기본값
linkedhashmap.containsKey("a"); // containsKey(): 키 존재 확인(true, false)
linkedhashmap.containsValue(861); // containsValue(): 값 존재 확인(true, false)

// 삭제
linkedhashmap.remove("a"); // remove(): 키로 삭제, 없으면 null
linkedhashmap.remove("b", 95); // remove(): 키-값이 일치할 때만 삭제(true, false)
linkedhashmap.clear(); // clear(): 모든 요소 삭제

// 크기/상태 확인
linkedhashmap.size(); // size(): 크기 반환
linkedhashmap.isEmpty(); // isEmpty(): 비어있는지 확인
```
