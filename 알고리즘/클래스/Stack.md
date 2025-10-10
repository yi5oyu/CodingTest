<div align="center">

# **Stack**

LIFO(Last In First Out) 방식으로 데이터를 관리하는 자료구조  
후입선출, 역순 처리, 되돌리기 기능

[ArrayDeque](#arraydeque) • [Stack](#stack)

</div>

## Stack

`LIFO(후입선출) 방식의 데이터 처리를 위한 자료구조`

1. 한쪽 끝에서만 삽입과 삭제 발생
2. LIFO(Last In First Out) 원칙
3. 가장 마지막에 삽입된 데이터가 가장 먼저 삭제됨
4. 접시 쌓기, 되돌리기(Undo) 기능과 유사
5. Java에서는 ArrayDeque 사용 권장

### 메소드

```java
push(e)    // 요소를 스택에 삽입
pop()      // 스택의 맨 위 요소를 제거하고 반환
peek()     // 스택의 맨 위 요소를 조회(제거 X)
isEmpty()  // 스택이 비어있는지 확인
size()     // 스택의 크기 반환
```

### 구조

```
Stack (LIFO):
      ↓ push
    ┌───┐
    │ D │ ← top (맨 위)
    ├───┤
    │ C │
    ├───┤
    │ B │
    ├───┤
    │ A │ ← bottom (맨 아래)
    └───┘
      ↑ pop

삽입/삭제는 top에서만 발생
```

## ArrayDeque

`동적 배열 기반의 Deque를 Stack으로 사용(가장 권장)`

```java
// ArrayDeque, Deque
import java.util.*;

// Stack으로 사용할 ArrayDeque 생성
Deque<Integer> stack = new ArrayDeque<>();
Deque<String> stack = new ArrayDeque<>(16); // 초기 용량 지정
Deque<String> stack = new ArrayDeque<>(collection);

// 기본 Stack 연산
stack.push(1);       // 맨 위에 추가
stack.push(2);
stack.push(3);

stack.peek();        // 3 (맨 위 조회, 제거 X)
stack.pop();         // 3 (맨 위 제거 후 반환)

// Deque 메소드로도 사용 가능
stack.offerFirst(1);     // push와 동일
stack.pollFirst();       // pop과 동일
stack.peekFirst();       // peek와 동일

// 조회
stack.peek();            // 맨 위 요소 조회(null)
stack.getFirst();        // 맨 위 요소 조회(예외)
stack.peekLast();        // 맨 아래 요소 조회(null)
stack.getLast();         // 맨 아래 요소 조회(예외)

// 특정 요소 확인
stack.contains(2);       // 요소 존재 확인
stack.isEmpty();         // 비어있는지 확인
stack.size();            // 크기 반환

// 반복문 (top에서 bottom 순서)
for(Integer item : stack) {
    System.out.println(item); // 3 → 2 → 1
}

stack.forEach(item -> {
    System.out.println(item);
});

Iterator<Integer> iterator = stack.iterator();
while(iterator.hasNext()) {
    Integer item = iterator.next();
}

// 역순 반복 (bottom에서 top 순서)
Iterator<Integer> descIterator = stack.descendingIterator();
while(descIterator.hasNext()) {
    Integer item = descIterator.next(); // 1 → 2 → 3
}

// 변환
Object[] arr = stack.toArray();
Integer[] intArr = stack.toArray(new Integer[0]);
List<Integer> list = new ArrayList<>(stack);

// 모든 요소 제거
stack.clear();

// 예제: 괄호 검사
public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    
    for(char c : s.toCharArray()) {
        if(c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if(stack.isEmpty()) return false;
            
            char top = stack.pop();
            if(c == ')' && top != '(') return false;
            if(c == '}' && top != '{') return false;
            if(c == ']' && top != '[') return false;
        }
    }
    
    return stack.isEmpty();
}

// 예제: 문자열 뒤집기
public String reverse(String str) {
    Deque<Character> stack = new ArrayDeque<>();
    
    for(char c : str.toCharArray()) {
        stack.push(c);
    }
    
    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()) {
        sb.append(stack.pop());
    }
    
    return sb.toString();
}
```

### 사용

- 일반적인 Stack 구현
- 빠른 성능이 필요한 경우
- 단일 스레드 환경
- null을 저장할 필요가 없는 경우
- 대부분의 경우 권장

## Stack

`Vector 기반의 레거시 Stack 클래스(사용 비권장)`

```java
// Stack (레거시)
import java.util.*;

// Stack 생성 (사용 비권장)
Stack<Integer> stack = new Stack<>();

// 기본 연산
stack.push(1);       // 맨 위에 추가, 추가된 요소 반환
stack.push(2);
stack.push(3);

stack.peek();        // 3 (맨 위 조회, 제거 X)
stack.pop();         // 3 (맨 위 제거 후 반환)

// Stack 클래스 전용 메소드
stack.empty();       // 비어있는지 확인 (isEmpty 대신)
stack.search(2);     // 요소의 위치 반환 (1부터 시작, 없으면 -1)

// 조회
stack.peek();        // 맨 위 요소 조회(예외 발생)

// 반복문
for(Integer item : stack) {
    System.out.println(item); // 1 → 2 → 3 (bottom → top)
}

Enumeration<Integer> elements = stack.elements();
while(elements.hasMoreElements()) {
    Integer item = elements.nextElement();
}

// 변환
Object[] arr = stack.toArray();
Integer[] intArr = stack.toArray(new Integer[0]);

// 크기/상태 확인
stack.size();        // 크기 반환
stack.empty();       // 비어있는지 확인
stack.isEmpty();     // 비어있는지 확인
stack.clear();       // 모든 요소 삭제
```

## 사용
`사용하지 말아야 하는 이유`

- Vector 기반(동기화 오버헤드)
- 성능이 느림
- 레거시 클래스
- ArrayDeque가 모든 면에서 우수

## 비교

| 자료구조구조 | Thread-safe | 성능 | null 허용 | 상태 | 
|---------|------|------|------|-----------|
| ArrayDeque | 동적 배열 | X | O(1) - 빠름 | X | 권장 ✅ |
| Stack 클래스 | Vector | O | O(1) - 느림 | O | 레거시 ❌ |
