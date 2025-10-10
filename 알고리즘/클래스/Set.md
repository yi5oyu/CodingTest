<div align="center">

# **Set**
  
중복을 허용하지 않는 데이터의 집합을 관리하는 자료구조  
빠른 중복 검사, 고유한 값 저장, 집합 연산

[Set 인터페이스](#set-인터페이스) • [HashSet](#hashset) • [LinkedHashSet](#linkedhashset) • [TreeSet](#treeset)

</div>

## Set 인터페이스

`중복을 허용하지 않는 데이터 집합의 표준 인터페이스`

1. 중복된 요소를 자동으로 제거
2. 순서를 보장하지 않음(구현체에 따라 다름)
3. 최대 하나의 null 허용(TreeSet 제외)
4. 인덱스로 접근 불가
5. Collection 인터페이스를 상속

### 중복 판단 방법


- HashSet/LinkedHashSet: hashCode()와 equals() 사용
1. hashCode()로 해시값 비교
2. 해시값이 같으면 equals()로 객체 비교
3. 둘 다 같으면 중복으로 판단

- TreeSet: compareTo() 또는 Comparator 사용
1. compareTo() 또는 compare()로 비교
2. 반환값이 0이면 중복으로 판단


## HashSet

`해시 테이블 기반의 Set 구현(빠른 성능, 순서 보장 X)`

```java
// HashSet, Set
import java.util.*;

// HashSet 생성
Set<String> hashset = new HashSet<>();
Set<String> hashset = new HashSet<>(16); // 초기 용량 지정
Set<String> hashset = new HashSet<>(16, 0.75f); // 초기 용량, 로드 팩터
Set<String> hashset = new HashSet<>(collection); // 다른 컬렉션에서 생성

// 추가
hashset.add("apple"); // 성공시 true, 중복시 false
hashset.addAll(Arrays.asList("banana", "cherry")); // 여러 요소 추가

// 조회
hashset.contains("apple"); // 요소 존재 확인(true, false)
hashset.containsAll(Arrays.asList("apple", "banana")); // 모든 요소 존재 확인

// 삭제
hashset.remove("apple"); // 요소 삭제(성공 true, 실패 false)
hashset.removeAll(Arrays.asList("apple", "banana")); // 여러 요소 삭제(차집합)
hashset.removeIf(s -> s.startsWith("a")); // 조건에 맞는 요소 삭제
hashset.retainAll(Arrays.asList("banana", "cherry")); // 지정 요소만 유지(교집합)
hashset.clear(); // 모든 요소 삭제

// 반복문
for(String fruit : hashset) { ... } // for-each문(순서 무작위)
hashset.forEach(fruit -> {
    // fruit 처리
});
Iterator<String> iterator = hashset.iterator();
while(iterator.hasNext()) {
    String fruit = iterator.next();
}

// 집합 연산
Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

// 합집합(Union)
Set<String> union = new HashSet<>(set1);
union.addAll(set2); // [a, b, c, d]

// 교집합(Intersection)
Set<String> intersection = new HashSet<>(set1);
intersection.retainAll(set2); // [b, c]

// 차집합(Difference)
Set<String> difference = new HashSet<>(set1);
difference.removeAll(set2); // [a]

// 대칭 차집합(Symmetric Difference)
Set<String> symmetricDiff = new HashSet<>(set1);
symmetricDiff.addAll(set2);
Set<String> temp = new HashSet<>(set1);
temp.retainAll(set2);
symmetricDiff.removeAll(temp); // [a, d]

// 부분집합 확인(Subset)
boolean isSubset = set2.containsAll(set1); // false

// 변환
Object[] arr = hashset.toArray(); // Object 배열로 변환
String[] strArr = hashset.toArray(new String[0]); // String 배열로 변환
List<String> list = new ArrayList<>(hashset); // List로 변환

// 크기/상태 확인
hashset.size(); // 크기 반환
hashset.isEmpty(); // 비어있는지 확인
```

## LinkedHashSet

`삽입 순서를 유지하는 HashSet(순서 보장 O)`

```java
// LinkedHashSet, Set
import java.util.*;

// LinkedHashSet 생성
Set<String> linkedhashset = new LinkedHashSet<>();
Set<String> linkedhashset = new LinkedHashSet<>(16); // 초기 용량 지정
Set<String> linkedhashset = new LinkedHashSet<>(16, 0.75f); // 초기 용량, 로드 팩터
Set<String> linkedhashset = new LinkedHashSet<>(collection); // 다른 컬렉션에서 생성

// 추가(삽입 순서 유지)
linkedhashset.add("first"); // 첫 번째
linkedhashset.add("second"); // 두 번째
linkedhashset.add("third"); // 세 번째
linkedhashset.addAll(Arrays.asList("fourth", "fifth"));

// 조회
linkedhashset.contains("first"); // 요소 존재 확인
linkedhashset.containsAll(Arrays.asList("first", "second"));

// 삭제
linkedhashset.remove("first"); // 요소 삭제
linkedhashset.removeAll(Arrays.asList("second", "third"));
linkedhashset.removeIf(s -> s.length() > 5);
linkedhashset.retainAll(Arrays.asList("fourth", "fifth"));
linkedhashset.clear();

// 반복문(삽입 순서대로)
for(String item : linkedhashset) { ... }
linkedhashset.forEach(item -> {
    // item 처리
});
Iterator<String> iterator = linkedhashset.iterator();
while(iterator.hasNext()) {
    String item = iterator.next();
}

// 변환
Object[] arr = linkedhashset.toArray();
String[] strArr = linkedhashset.toArray(new String[0]);
List<String> list = new ArrayList<>(linkedhashset); // 순서 유지

// 크기/상태 확인
linkedhashset.size();
linkedhashset.isEmpty();
```

## TreeSet

`레드-블랙 트리 기반, 정렬된 Set 구현(정렬 보장 O)`

```java
// TreeSet, NavigableSet, SortedSet
import java.util.*;

// TreeSet 생성
TreeSet<String> treeset = new TreeSet<>(); // 기본 정렬(오름차순)
TreeSet<String> treeset = new TreeSet<>(Collections.reverseOrder()); // 내림차순
TreeSet<String> treeset = new TreeSet<>((a, b) -> b.compareTo(a)); // Comparator 지정
TreeSet<String> treeset = new TreeSet<>(sortedSet); // 정렬된 Set에서 생성

// 추가(자동 정렬)
treeset.add("cherry"); // 자동으로 정렬된 위치에 삽입
treeset.add("apple");
treeset.add("banana");
treeset.addAll(Arrays.asList("date", "elderberry"));

// 조회
treeset.contains("apple"); // 요소 존재 확인
treeset.containsAll(Arrays.asList("apple", "banana"));

// 정렬 관련 조회
treeset.first(); // 가장 작은 요소
treeset.last(); // 가장 큰 요소
treeset.lower("cherry"); // cherry보다 작은 가장 큰 요소
treeset.higher("cherry"); // cherry보다 큰 가장 작은 요소
treeset.floor("cherry"); // cherry 이하 가장 큰 요소(cherry 포함)
treeset.ceiling("cherry"); // cherry 이상 가장 작은 요소(cherry 포함)

// 부분 Set 조회
treeset.subSet("banana", "date"); // banana(포함) ~ date(미포함)
treeset.subSet("banana", true, "date", true); // 양쪽 포함 여부 지정
treeset.headSet("cherry"); // 처음 ~ cherry(미포함)
treeset.headSet("cherry", true); // 처음 ~ cherry(포함)
treeset.tailSet("cherry"); // cherry(포함) ~ 끝
treeset.tailSet("cherry", false); // cherry(미포함) ~ 끝

// 삭제
treeset.remove("apple"); // 요소 삭제
treeset.pollFirst(); // 가장 작은 요소 제거 후 반환
treeset.pollLast(); // 가장 큰 요소 제거 후 반환
treeset.removeAll(Arrays.asList("banana", "cherry"));
treeset.removeIf(s -> s.length() < 5);
treeset.retainAll(Arrays.asList("date", "elderberry"));
treeset.clear();

// 반복문(정렬된 순서)
for(String fruit : treeset) { ... }
treeset.forEach(fruit -> {
    // fruit 처리
});

// 역순 순회
NavigableSet<String> descSet = treeset.descendingSet(); // 역순 Set
for(String fruit : descSet) { ... }
Iterator<String> descIterator = treeset.descendingIterator(); // 역순 Iterator
while(descIterator.hasNext()) {
    String fruit = descIterator.next();
}

// 범위 연산
SortedSet<String> range = treeset.subSet("b", "d"); // b ~ d 범위
int count = range.size(); // 범위 내 요소 개수

// Comparator 조회
Comparator<? super String> comparator = treeset.comparator(); // null이면 자연 순서

// 변환
Object[] arr = treeset.toArray();
String[] strArr = treeset.toArray(new String[0]);
List<String> list = new ArrayList<>(treeset); // 정렬된 List

// 크기/상태 확인
treeset.size();
treeset.isEmpty();
```

## 비교

| 자료구조 | 구조 | 순서정렬 | null 허용 | 시간복잡도 | 특징 |
|---------|------|------|------|-----------|------|
| HashSet | 해시 테이블 | X | X | O(1개) | O(1) | 가장 빠른 성능 | 
| LinkedHashSet | 해시 테이블 + 연결 리스트 | O(삽입) | X | O(1개) | O(1) | 삽입 순서 유지 | 
| TreeSet | 레드-블랙 트리 | O(정렬) | O | X | O(log n) | 자동 정렬, 범위 검색 | 
