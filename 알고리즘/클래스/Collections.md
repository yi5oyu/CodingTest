<div align="center">

# **Collections**

컬렉션을 다루기 위한 유틸리티 클래스  
정렬, 검색, 동기화, 불변 컬렉션

</div>

## Collections 클래스

`컬렉션 조작을 위한 정적 메소드 제공 (java.util.Collections)`

1. 모든 메소드가 static (객체 생성 불필요)
2. List, Set, Map 등 모든 컬렉션 지원
3. 정렬, 검색, 동기화, 불변화 제공
4. Thread-safe 래퍼 제공

### 메소드

```java
// Collections
import java.util.*;

List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

// 정렬
Collections.sort(list);                             // [1, 2, 5, 8, 9] (오름차순)
Collections.sort(list, Collections.reverseOrder()); // [9, 8, 5, 2, 1] (내림차순)
Collections.sort(list, (a, b) -> b - a);            // 커스텀 정렬
Collections.reverse(list);                          // [9, 1, 8, 2, 5] (순서 뒤집기)

// 검색
Collections.binarySearch(list, 5);                  // 인덱스(정렬 필수)
Collections.max(list);                              // 9 (최댓값)
Collections.min(list);                              // 1 (최솟값)
Collections.frequency(list, 5);                     // 1 (등장 횟수)

// 섞기/회전
Collections.shuffle(list);                          // 무작위 섞기
Collections.shuffle(list, new Random(42));          // 시드 고정
Collections.rotate(list, 2);                        // 오른쪽으로 2칸 회전
Collections.swap(list, 0, 4);                       // 0번과 4번 교환

// 채우기/교체
Collections.fill(list, 0);                          // [0, 0, 0, 0, 0]
Collections.replaceAll(list, 0, 10);                // 0을 10으로 교체
Collections.copy(dest, src);                        // src를 dest로 복사 (dest 크기 ≥ src)

// 불변 컬렉션(수정 불가)
List<Integer> unmodifiable = Collections.unmodifiableList(list);
Set<Integer> unmodifiableSet = Collections.unmodifiableSet(set);
Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);
// add, remove 등 수정 시 UnsupportedOperationException

// 동기화 컬렉션 (Thread-safe)
List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());

// 반복 시 명시적 동기화 필요
synchronized(syncList) {
    for(Integer item : syncList) {
        // 처리
    }
}

// 빈 컬렉션
List<Integer> emptyList = Collections.emptyList();
Set<Integer> emptySet = Collections.emptySet();
Map<String, Integer> emptyMap = Collections.emptyMap();

// 싱글톤 컬렉션
List<Integer> singleton = Collections.singletonList(42);
Set<Integer> singletonSet = Collections.singleton(42);
Map<String, Integer> singletonMap = Collections.singletonMap("key", 42);

// 반복 컬렉션
List<Integer> nCopies = Collections.nCopies(5, 10); // [10, 10, 10, 10, 10]

// 비교자
Comparator<Integer> reverseOrder = Collections.reverseOrder();
Comparator<String> caseInsensitive = String.CASE_INSENSITIVE_ORDER;

// 분리
boolean disjoint = Collections.disjoint(list1, list2); // 교집합 없으면 true

// 추가
Collections.addAll(list, 1, 2, 3, 4, 5);    // 여러 요소 추가

// 체크 컬렉션 (타입 안전)
List<Integer> checkedList = Collections.checkedList(
    new ArrayList<>(), Integer.class
);

// 잘못된 타입 추가 시 ClassCastException
```
