<div align="center">

# **Queue**

FIFO(First In First Out) 방식으로 데이터를 관리하는 자료구조  
순차적 처리, 우선순위 처리, 양방향 접근

[Queue 인터페이스](#queue-인터페이스) • [LinkedList](#linkedlist-1) • [ArrayDeque](#arraydeque) • [PriorityQueue](#priorityqueue) • [ConcurrentLinkedQueue](#concurrentlinkedqueue) • [BlockingQueue](#blockingqueue)

</div>

## Queue 인터페이스

`FIFO(선입선출) 방식의 데이터 처리를 위한 표준 인터페이스`

1. 한쪽 끝에서 삽입, 반대쪽 끝에서 삭제
2. FIFO(First In First Out) 원칙
3. Collection 인터페이스를 상속
4. 두 가지 메소드 세트 제공(예외 vs null 반환)
5. Deque는 Queue의 확장 인터페이스(양방향)

### 메소드

```java
// 예외를 던지는 메소드
add(e)     // 성공시 true, 실패시 IllegalStateException
remove()   // 요소 제거 후 반환, 비어있으면 NoSuchElementException
element()  // 조회만, 비어있으면 NoSuchElementException// null을 반환하는 메소드
offer(e)   // 성공시 true, 실패시 false
poll()     // 요소 제거 후 반환, 비어있으면 null
peek()     // 조회만, 비어있으면 null
```

### 구조(Queue vs Deque)

```
Queue (FIFO):
rear(뒤) ←─ [A][B][C][D] ─→ front(앞)
        삽입            삭제

Deque (양방향):
[A][B][C][D]
↕        ↕
앞/뒤 모두 삽입/삭제 가능
```

## LinkedList

`이중 연결 리스트 기반의 Queue 구현(List + Queue + Deque 구현)`

```java
// LinkedList, Queue, Deque, List
import java.util.*;

// LinkedList를 Queue로 사용
Queue<String> queue = new LinkedList<>();
Deque<String> deque = new LinkedList<>();

// 추가
queue.offer("first");  // 성공시 true, 실패시 false
queue.add("second");   // 성공시 true, 실패시 예외
queue.offer("third");

// 조회(제거 X)
queue.peek();    // 첫 번째 요소 조회, 비어있으면 null
queue.element(); // 첫 번째 요소 조회, 비어있으면 예외

// 삭제
queue.poll();   // 첫 번째 요소 제거 후 반환, 비어있으면 null
queue.remove(); // 첫 번째 요소 제거 후 반환, 비어있으면 예외

// Deque 기능 사용
Deque<String> deque = new LinkedList<>();
deque.offerFirst("front");  // 앞에 추가
deque.offerLast("back");    // 뒤에 추가
deque.pollFirst();          // 앞에서 제거
deque.pollLast();           // 뒤에서 제거
deque.peekFirst();          // 앞 조회
deque.peekLast();           // 뒤 조회

// Stack처럼 사용
deque.push("element");  // 앞에 추가
deque.pop();            // 앞에서 제거

// 반복문
for(String item : queue) { ... }
Iterator<String> iterator = queue.iterator();
while(iterator.hasNext()) {
    String item = iterator.next();
}

// 특징
// - null 허용 (유일하게)
// - Thread-safe 하지 않음
// - List 인터페이스도 구현

// 변환
Object[] arr = queue.toArray();
String[] strArr = queue.toArray(new String[0]);

// 크기/상태 확인
queue.size();
queue.isEmpty();
queue.clear();
```

### 사용

- null을 저장해야 하는 경우
- List 인터페이스 기능도 필요한 경우
- 인덱스 접근이 필요한 경우
- 메모리보다 유연성이 중요한 경우

## ArrayDeque

`동적 배열 기반의 Deque 구현(빠른 성능, 양방향 Queue)`

```java
// ArrayDeque, Deque, Queue
import java.util.*;

// ArrayDeque 생성
Deque<String> deque = new ArrayDeque<>();
Queue<String> queue = new ArrayDeque<>();
Deque<String> deque = new ArrayDeque<>(16); // 초기 용량 지정
Deque<String> deque = new ArrayDeque<>(collection);

// Queue 메소드
queue.offer("a");    // 뒤에 추가
queue.add("b");      // 뒤에 추가
queue.peek();        // 앞 조회
queue.element();     // 앞 조회
queue.poll();        // 앞에서 제거
queue.remove();      // 앞에서 제거

// Deque 메소드 - 양방향 추가
deque.offerFirst("first");    // 앞에 추가
deque.offerLast("last");      // 뒤에 추가
deque.addFirst("first");      // 앞에 추가(예외)
deque.addLast("last");        // 뒤에 추가(예외)

// Deque 메소드 - 양방향 조회
deque.peekFirst();            // 앞 조회(null)
deque.peekLast();             // 뒤 조회(null)
deque.getFirst();             // 앞 조회(예외)
deque.getLast();              // 뒤 조회(예외)

// Deque 메소드 - 양방향 삭제
deque.pollFirst();            // 앞에서 제거(null)
deque.pollLast();             // 뒤에서 제거(null)
deque.removeFirst();          // 앞에서 제거(예외)
deque.removeLast();           // 뒤에서 제거(예외)

// Stack처럼 사용 (LIFO)
deque.push("element");        // 앞에 추가
deque.pop();                  // 앞에서 제거

// 특정 요소 제거
deque.remove("element");              // 첫 번째 일치 제거
deque.removeFirstOccurrence("a");     // 첫 번째 일치 제거
deque.removeLastOccurrence("a");      // 마지막 일치 제거

// 반복문
for(String item : deque) { ... }
// 역방향 반복
Iterator<String> descIterator = deque.descendingIterator();
while(descIterator.hasNext()) {
    String item = descIterator.next();
}

// 특징
// - null 허용 안 함
// - LinkedList보다 빠름 (메모리 지역성)
// - Thread-safe 하지 않음
// - 용량 자동 확장(2배)

// 변환
Object[] arr = deque.toArray();
String[] strArr = deque.toArray(new String[0]);

// 크기/상태 확인
deque.size();
deque.isEmpty();
deque.clear();
```

### 사용

- 일반적인 Queue/Deque 구현
- 빠른 성능이 필요한 경우
- Stack 대용으로 사용
- null을 저장할 필요가 없는 경우
- 대부분의 경우 권장

## PriorityQueue

`힙(Heap) 기반의 우선순위 Queue(자동 정렬, 최소/최대 힙)`

```java
// PriorityQueue, Queue
import java.util.*;

// PriorityQueue 생성
PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙(기본)
PriorityQueue<Integer> pq = new PriorityQueue<>(11); // 초기 용량
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // 최대 힙
PriorityQueue<Integer> pq = new PriorityQueue<>(collection);

// 추가(자동 정렬)
pq.offer(5);     // 우선순위에 맞게 삽입
pq.add(3);       // 우선순위에 맞게 삽입
pq.offer(8);
pq.offer(1);     // 내부적으로 힙 구조 유지

// 조회(가장 우선순위 높은 요소)
pq.peek();       // 최소값(또는 최대값) 조회, null 반환
pq.element();    // 최소값(또는 최대값) 조회, 예외 발생

// 삭제(가장 우선순위 높은 요소)
pq.poll();       // 최소값(또는 최대값) 제거 후 반환, null
pq.remove();     // 최소값(또는 최대값) 제거 후 반환, 예외

// 특정 요소 확인/삭제
pq.contains(5);  // 요소 존재 확인
pq.remove(5);    // 특정 요소 제거(O(n))

// 커스텀 객체 정렬
class Task implements Comparable<Task> {
    String name;
    int priority;
    
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}

PriorityQueue<Task> taskQueue = new PriorityQueue<>();
taskQueue.offer(new Task("Low", 3));
taskQueue.offer(new Task("High", 1));
taskQueue.offer(new Task("Medium", 2));
// poll() 시 priority 순서대로: High(1) → Medium(2) → Low(3)

// Comparator 사용
PriorityQueue<Task> taskQueue = new PriorityQueue<>(
    (t1, t2) -> Integer.compare(t1.priority, t2.priority)
);

// 반복문(순서 보장 안 됨!)
for(Integer num : pq) { 
    // 내부 힙 배열 순서대로 순회(정렬 순서 아님!)
}
// 정렬된 순서로 처리하려면
while(!pq.isEmpty()) {
    System.out.println(pq.poll()); // 우선순위 순서대로 출력
}

// 특징
// - null 허용 안 함
// - 우선순위 기반 정렬
// - Thread-safe 하지 않음
// - O(log n) 삽입/삭제
// - 반복 순서는 정렬 순서가 아님

// 변환
Object[] arr = pq.toArray();
Integer[] intArr = pq.toArray(new Integer[0]);

// 크기/상태 확인
pq.size();
pq.isEmpty();
pq.clear();
```

### 사용

- 우선순위 기반 처리가 필요한 경우
- 최소/최대 힙 구현
- 정렬된 순서로 데이터 처리
- 작업 스케줄링

## 비교 

| 자료구조 | 구조 | 양방향 | 우선순위 | null 허용 | 시간복잡도 | 특징 | 
|---------|------|------|------|-----------|------|------|
| LinkedList | 연결 리스트 | O | X | O | O(1) | List + Queue + Deque | 
| ArrayDeque | 동적 배열 | O | X | X | O(1) | 가장 빠른 Queue/Deque | 
| PriorityQueue | 힙 | X | O | X | O(log n) | 우선순위 기반 정렬 | 
