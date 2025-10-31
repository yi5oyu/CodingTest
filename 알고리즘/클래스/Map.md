<div align="center">
  
# **Map**
  
키(Key)와 값(Value)을 하나의 쌍으로 묶어 관리하는 자료구조
키는 중복될 수 없으며, 값은 중복될 수 있음
  
Map 인터페이스 • HashMap • LinkedHashMap • TreeMap

</div>

## Map 인터페이스

`키-값 쌍의 데이터를 다루는 자료구조의 표준 인터페이스`

키(Key)는 중복을 허용하지 않습니다.
값(Value)은 중복을 허용합니다.
키를 통해 값에 빠르게 접근할 수 있습니다.
HashMap, LinkedHashMap, TreeMap 등이 Map 인터페이스를 구현합니다.

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
| LinkedHashMap | O | X | 키X/값O | O(1) | 삽입 순서 유지 |
| TreeMap | O | O | 키X/값O | O(log n) | 자동 정렬, 범위 검색 |
