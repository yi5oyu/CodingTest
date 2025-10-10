<div align="center">

# **List**
  
순서가 있는 데이터의 집합을 관리하는 자료구조  
인덱스를 통한 접근, 중복 허용, 동적 크기 조절

[List 인터페이스](#list-인터페이스) • [ArrayList](#arraylist) • [LinkedList](#linkedlist) • [Vector](#vector) • [CopyOnWriteArrayList](#copyonwritearraylist)

</div>

## List 인터페이스

`순서가 있는 데이터를 다루는 자료구조의 표준 인터페이스`

1. 순서를 유지하며 저장(삽입 순서 보장)
2. 인덱스로 요소에 접근 가능
3. 중복된 요소 허용
4. null 값 저장 가능
5. Collection 인터페이스를 상속

## ArrayList

`동적 배열을 구현한 클래스(배열 기반, 빠른 조회)`

```java
// ArrayList, List
import java.util.*;

// ArrayList 생성
List<String> arraylist = new ArrayList<>();
List<String> arraylist = new ArrayList<>(10); // 초기 용량 지정
List<String> arraylist = new ArrayList<>(list); // 다른 리스트 복사
List<String> arraylist = Arrays.asList("a", "b", "c"); // 고정 크기 리스트

// 추가
arraylist.add("apple"); // 마지막에 추가
arraylist.add(1, "banana"); // 특정 인덱스에 삽입
arraylist.addAll(Arrays.asList("cherry", "date")); // 여러 요소 추가
arraylist.addAll(1, Arrays.asList("x", "y")); // 특정 위치에 여러 요소 추가

// 조회
arraylist.get(0); // 인덱스로 요소 조회
arraylist.indexOf("apple"); // 요소의 첫 인덱스 반환(-1: 없음)
arraylist.lastIndexOf("apple"); // 요소의 마지막 인덱스 반환
arraylist.contains("banana"); // 요소 존재 확인(true, false)
arraylist.containsAll(Arrays.asList("apple", "banana")); // 모든 요소 존재 확인

// 수정
arraylist.set(0, "apricot"); // 특정 인덱스의 요소 변경(기존 값 반환)

// 삭제
arraylist.remove(0); // 인덱스로 삭제(삭제된 요소 반환)
arraylist.remove("apple"); // 객체로 삭제(첫 번째 일치 항목, true/false)
arraylist.removeAll(Arrays.asList("apple", "banana")); // 여러 요소 삭제
arraylist.removeIf(s -> s.startsWith("a")); // 조건에 맞는 요소 삭제
arraylist.retainAll(Arrays.asList("apple", "banana")); // 지정 요소만 유지
arraylist.clear(); // 모든 요소 삭제

// 반복문
for(String fruit : arraylist) { ... } // for-each문
for(int i = 0; i < arraylist.size(); i++) { 
    String fruit = arraylist.get(i); 
}
Iterator<String> iterator = arraylist.iterator();
while(iterator.hasNext()) {
    String fruit = iterator.next();
}
arraylist.forEach(fruit -> {
    // fruit 처리
});

// 리스트 복사
List<String> newList = new ArrayList<>(arraylist); // 얕은 복사
List<String> subList = arraylist.subList(1, 3); // 부분 리스트(원본 연결)

// 정렬
Collections.sort(arraylist); // 오름차순 정렬
Collections.sort(arraylist, Collections.reverseOrder()); // 내림차순 정렬
arraylist.sort(Comparator.naturalOrder()); // 오름차순
arraylist.sort(Comparator.reverseOrder()); // 내림차순
arraylist.sort((a, b) -> a.length() - b.length()); // 커스텀 정렬

// 검색
Collections.binarySearch(arraylist, "apple"); // 이진 검색(정렬 필요, 인덱스 반환)

// 변환
Object[] arr = arraylist.toArray(); // Object 배열로 변환
String[] strArr = arraylist.toArray(new String[0]); // String 배열로 변환
String[] strArr2 = arraylist.toArray(new String[arraylist.size()]);

// 크기/상태 확인
arraylist.size(); // 크기 반환
arraylist.isEmpty(); // 비어있는지 확인(true, false)

// 용량 관리
arraylist.ensureCapacity(100); // 최소 용량 확보
arraylist.trimToSize(); // 용량을 현재 크기에 맞춤
```

### 사용

 - 데이터 조회가 빈번한 경우
 - 데이터가 순차적으로 추가/삭제되는 경우
 - 인덱스 기반 접근이 필요한 경우

## LinkedList

`이중 연결 리스트를 구현한 클래스(노드 기반, 빠른 삽입/삭제)`

```java
// LinkedList, List, Deque
import java.util.*;

// LinkedList 생성
LinkedList<String> linkedlist = new LinkedList<>();
LinkedList<String> linkedlist = new LinkedList<>(list); // 다른 컬렉션 복사

// 추가
linkedlist.add("apple"); // 마지막에 추가
linkedlist.add(1, "banana"); // 특정 인덱스에 삽입
linkedlist.addFirst("first"); // 맨 앞에 추가
linkedlist.addLast("last"); // 맨 뒤에 추가
linkedlist.offer("element"); // 큐처럼 요소 추가(마지막)
linkedlist.offerFirst("first"); // 맨 앞에 추가
linkedlist.offerLast("last"); // 맨 뒤에 추가
linkedlist.push("element"); // 스택처럼 요소 추가(맨 앞)

// 조회
linkedlist.get(0); // 인덱스로 요소 조회
linkedlist.getFirst(); // 첫 번째 요소 조회
linkedlist.getLast(); // 마지막 요소 조회
linkedlist.peek(); // 첫 번째 요소 조회(삭제 X, null 반환 가능)
linkedlist.peekFirst(); // 첫 번째 요소 조회
linkedlist.peekLast(); // 마지막 요소 조회
linkedlist.element(); // 첫 번째 요소 조회(예외 발생 가능)
linkedlist.indexOf("apple"); // 요소의 첫 인덱스 반환
linkedlist.lastIndexOf("apple"); // 요소의 마지막 인덱스 반환
linkedlist.contains("banana"); // 요소 존재 확인

// 수정
linkedlist.set(0, "apricot"); // 특정 인덱스의 요소 변경

// 삭제
linkedlist.remove(); // 첫 번째 요소 제거 후 반환
linkedlist.remove(0); // 인덱스로 삭제
linkedlist.remove("apple"); // 객체로 삭제(첫 번째 일치)
linkedlist.removeFirst(); // 첫 번째 요소 제거
linkedlist.removeLast(); // 마지막 요소 제거
linkedlist.poll(); // 첫 번째 요소 제거 후 반환(null 가능)
linkedlist.pollFirst(); // 첫 번째 요소 제거
linkedlist.pollLast(); // 마지막 요소 제거
linkedlist.pop(); // 첫 번째 요소 제거(스택)
linkedlist.removeFirstOccurrence("apple"); // 첫 번째 일치 항목 제거
linkedlist.removeLastOccurrence("apple"); // 마지막 일치 항목 제거
linkedlist.clear(); // 모든 요소 삭제

// 반복문
for(String fruit : linkedlist) { ... }
Iterator<String> iterator = linkedlist.iterator();
while(iterator.hasNext()) {
    String fruit = iterator.next();
}
// 역방향 반복
Iterator<String> descIterator = linkedlist.descendingIterator();
while(descIterator.hasNext()) {
    String fruit = descIterator.next();
}

// 변환
Object[] arr = linkedlist.toArray();
String[] strArr = linkedlist.toArray(new String[0]);

// 크기/상태 확인
linkedlist.size(); // 크기 반환
linkedlist.isEmpty(); // 비어있는지 확인
```

### 사용

 - 중간에 데이터 삽입/삭제가 빈번한 경우
 - Queue, Deque 구현이 필요한 경우
 - 메모리가 충분하고 순차 접근이 주된 경우

## Vector

`동기화된 동적 배열(Thread-safe, 레거시 클래스)`

```java
// Vector, List
import java.util.*;

// Vector 생성
Vector<String> vector = new Vector<>();
Vector<String> vector = new Vector<>(10); // 초기 용량 지정
Vector<String> vector = new Vector<>(10, 5); // 초기 용량, 증가량 지정
Vector<String> vector = new Vector<>(list); // 다른 컬렉션 복사

// 추가
vector.add("apple"); // 마지막에 추가
vector.add(1, "banana"); // 특정 인덱스에 삽입
vector.addElement("cherry"); // 레거시 메소드
vector.insertElementAt("date", 2); // 특정 위치에 삽입

// 조회
vector.get(0); // 인덱스로 요소 조회
vector.elementAt(0); // 레거시 메소드
vector.firstElement(); // 첫 번째 요소
vector.lastElement(); // 마지막 요소
vector.indexOf("apple"); // 요소의 인덱스 반환
vector.contains("banana"); // 요소 존재 확인

// 수정
vector.set(0, "apricot"); // 특정 인덱스의 요소 변경
vector.setElementAt("grape", 1); // 레거시 메소드

// 삭제
vector.remove(0); // 인덱스로 삭제
vector.remove("apple"); // 객체로 삭제
vector.removeElement("banana"); // 레거시 메소드
vector.removeElementAt(1); // 인덱스로 삭제(레거시)
vector.removeAllElements(); // 모든 요소 삭제(레거시)
vector.clear(); // 모든 요소 삭제

// 반복문
for(String fruit : vector) { ... }
Enumeration<String> enumeration = vector.elements(); // 레거시 방식
while(enumeration.hasMoreElements()) {
    String fruit = enumeration.nextElement();
}

// 용량 관리
vector.capacity(); // 현재 용량 반환
vector.ensureCapacity(100); // 최소 용량 확보
vector.trimToSize(); // 용량을 현재 크기에 맞춤

// 변환
Object[] arr = vector.toArray();
String[] strArr = vector.toArray(new String[0]);

// 크기/상태 확인
vector.size(); // 크기 반환
vector.isEmpty(); // 비어있는지 확인
```

## CopyOnWriteArrayList

`쓰기 시 복사 방식의 Thread-safe 리스트(읽기 성능 최적화)`

```java
// CopyOnWriteArrayList, List
import java.util.concurrent.*;

// CopyOnWriteArrayList 생성
CopyOnWriteArrayList<String> cowlist = new CopyOnWriteArrayList<>();
CopyOnWriteArrayList<String> cowlist = new CopyOnWriteArrayList<>(list);
CopyOnWriteArrayList<String> cowlist = new CopyOnWriteArrayList<>(
    new String[]{"a", "b", "c"}
);

// 추가 (복사 발생)
cowlist.add("apple");
cowlist.add(1, "banana");
cowlist.addAll(Arrays.asList("cherry", "date"));
cowlist.addIfAbsent("fig"); // 없을 때만 추가

// 조회 (락 없이 빠름)
cowlist.get(0);
cowlist.indexOf("apple");
cowlist.contains("banana");

// 수정 (복사 발생)
cowlist.set(0, "apricot");

// 삭제 (복사 발생)
cowlist.remove(0);
cowlist.remove("apple");
cowlist.clear();

// 반복문 (스냅샷 반복, ConcurrentModificationException 없음)
for(String fruit : cowlist) { ... }
Iterator<String> iterator = cowlist.iterator();
while(iterator.hasNext()) {
    String fruit = iterator.next();
    // iterator.remove()는 지원하지 않음
}

// 크기/상태 확인
cowlist.size();
cowlist.isEmpty();
```

### 사용

 - 멀티스레드 환경에서 읽기 작업이 압도적으로 많은 경우
 - 이벤트 리스너 목록 관리
 - 반복 중 수정이 필요한 경우

## 비교

| 자료구조 | 구조 | 조회 | 삽입/삭제(중간) | 삽입/삭제(끝) | Thread-safe | 특징 |
|---------|------|------|------|-----------|------|------|
| ArrayList | 배열 | O(1) | O(n) | O(1) | X | 조회가 빈번할 때 최적| 
| LinkedList | 노드 | O(n) | O(1)* | O(1) | X | 삽입/삭제가 빈번할 때 |
| Vector | 배열 | O(1) | O(n) | O(1) | O | 레거시, 사용 비권장 |
| CopyOnWriteArrayList | 배열 | O(1) | O(n) | O(n) | O | 읽기 > 쓰기일 때 |
