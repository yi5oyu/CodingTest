<div align="center">

# **String**

불변(Immutable) 문자열 객체
문자열 처리, 검색, 변환, 비교

[String 클래스](#string-클래스) • [StringBuilder](#stringbuilder) • [StringBuffer](#stringbuffer)

</div>

## String 클래스

`불변(Immutable) 문자열 객체 - 한번 생성되면 변경 불가`

`문자열 리터럴`: 큰따옴표(")로 감싼 문자열
`String Pool`: JVM의 Heap 메모리 영역

1. 문자열 리터럴은 String Pool에 저장됨
2. 같은 리터럴은 같은 객체 참조 (메모리 절약)
3. Thread-safe(여러 스레드가 동시 접근해도 안전, 데이터 충돌이나 예상치 못한 결과가 발생하지 않음)
4. 해시코드 캐싱(한 번 계산한 해시코드를 저장해두고 재사용, HashMap 등에서 효율적)
5. 모든 메소드는 새 객체를 반환

### 메소드

```java
String str = "AaBbCc";

// 문자열 길이 | int length()
str.length(); // 6

// 빈 문자열 여부 | boolean isEmpty()
str.isEmpty(); // false

// 내용 비교 | boolean equals(Object obj)
str.equals("AaBbCc"); // true

// 대소문자 무시 비교 | boolean equalsIgnoreCase(String)
str.equalsIgnoreCase("aabbcc"); // true

// 비교(사전순) | int compareTo(String)
str.compareTo("AaBbCc"); // 0

// index 위치의 문자 | char charAt(int index)
str.charAt(0); // 'A'

// 문자열 첫 등장 위치 | int indexOf(String str)
str.indexOf("Bb"); // 2

// 문자열 마지막 등장 위치 | int lastIndexOf(String str)
str.lastIndexOf("b"); // 3
   
// 포함 여부 | boolean contains(CharSequence s)
str.contains("Bb"); // true

// 시작 문자열 확인 | boolean startsWith(String prefix)
str.startsWith("Aa"); // true
  
// 끝 문자열 확인 | boolean endsWith(String suffix)
str.endsWith("Cc"); // true
    
// 정규식 매칭 | boolean matches(String regex)       
str.matches("[A-Za-z]+"); // true

// begin부터 끝까지 | String substring(int begin)
str.substring(2); // "BbCc"

// begin~end-1까지 | String substring(int begin, int end)   
str.substring(2, 4); // "Bb"

// 정규식으로 분할 | String[] split(String regex)
str.split("b"); // ["AaB", "Cc"]

// 최대 limit개로 분할 | String[] split(String regex, int limit) 
str.split("b", 2); // ["AaB", "Cc"]

// 소문자 변환 | String toLowerCase()           
str.toLowerCase(); // "aabbcc"

// 대문자 변환 | String toUpperCase()           
str.toUpperCase(); // "AABBCC"

// 앞뒤 공백 제거 | String trim()                  
"  Aa  ".trim(); // "Aa"

// 문자 치환 | String replace(char old, char new)        
str.replace('A', 'X'); // "XaBbCc"

// 문자열 치환 | String replace(String old, String new)    
str.replace("Aa", "Xx"); // "XxBbCc"

// 정규식 치환 | String replaceAll(String regex, String s) 
str.replaceAll("[A-Z]", "X"); // "XaXbXc"

// 첫 매칭만 치환 | String replaceFirst(String regex, String s) 
str.replaceFirst("[A-Z]", "X"); // "XaBbCc

// char 배열로 변환 | char[] toCharArray()           
str.toCharArray(); // ['A', 'a', 'B', 'b', 'C', 'c']

// 문자열 연결 | String concat(String str)      
str.concat("Dd"); // "AaBbCcDd"

// 구분자로 결합 | String join(String delimiter, String... strs) 
String.join("-", "A", "B", "C"); // "A-B-C"

// printf 스타일 | static String format(String format, Object... args) 
String.format("Hello %s", "World"); // "Hello World"

// 다양한 타입을 String으로 | static String valueOf(...)     
String.valueOf(123); // "123"

// 공백만 있는지 | boolean isBlank() | (Java 11+)
str.isBlank(); // false

// 반복 | String repeat(int count) | (Java 11+)
str.repeat(2); // "AaBbCcAaBbCc"

// 앞뒤 공백 제거 | String strip() | (유니코드, Java 11+)
"  Aa  ".strip(); // "Aa"
```

## StringBuilder

`가변(Mutable) 문자열 - 내용 변경 가능 (비동기, 빠름)`

```java
// StringBuilder
import java.util.*;

// StringBuilder 생성
StringBuilder sb = new StringBuilder();
StringBuilder sb = new StringBuilder("Hello");
StringBuilder sb = new StringBuilder(100); // 초기 용량

// 문자열 추가 (append)
sb.append("Hello");
sb.append(" ");
sb.append("World");
sb.append(123);
sb.append(3.14);
sb.append(true);
sb.append(new char[]{'a', 'b'});

// 특정 위치에 삽입 (insert)
sb.insert(5, " Java");           // 5번 인덱스에 삽입

// 특정 부분 삭제 (delete)
sb.delete(5, 10);                // 5~9번 인덱스 삭제
sb.deleteCharAt(0);              // 0번 인덱스 문자 삭제

// 특정 부분 치환 (replace)
sb.replace(0, 5, "Hi");          // 0~4번을 "Hi"로 치환

// 문자열 뒤집기 (reverse)
sb.reverse();

// 특정 위치 문자 변경 (setCharAt)
sb.setCharAt(0, 'H');

// 길이 변경 (setLength)
sb.setLength(5);                 // 길이를 5로 조정

// 조회
sb.charAt(0);                    // 특정 위치 문자
sb.length();                     // 길이
sb.capacity();                   // 용량
sb.substring(0, 5);              // 부분 문자열
sb.indexOf("World");             // 문자열 위치
sb.lastIndexOf("o");             // 마지막 위치

// String으로 변환
String result = sb.toString();

// 예제: 효율적인 문자열 연결
StringBuilder sb = new StringBuilder();
for(int i = 0; i < 1000; i++) {
    sb.append("Hello ");
}
String result = sb.toString();

// 예제: 문자열 뒤집기
StringBuilder sb = new StringBuilder("Hello");
String reversed = sb.reverse().toString(); // "olleH"

// 예제: 구분자로 문자열 만들기
StringBuilder sb = new StringBuilder();
String[] words = {"A", "B", "C"};
for(int i = 0; i < words.length; i++) {
    if(i > 0) sb.append(", ");
    sb.append(words[i]);
}
String result = sb.toString(); // "A, B, C"
```

## StringBuffer

`가변(Mutable) 문자열 - 내용 변경 가능 (동기, 느림, Thread-safe)`

```java
// StringBuffer
import java.util.*;

// StringBuffer 생성
StringBuffer sbf = new StringBuffer();
StringBuffer sbf = new StringBuffer("Hello");
StringBuffer sbf = new StringBuffer(100); // 초기 용량

// StringBuilder와 동일한 메소드 제공
sbf.append("Hello");
sbf.insert(5, " Java");
sbf.delete(5, 10);
sbf.replace(0, 5, "Hi");
sbf.reverse();
sbf.setCharAt(0, 'H');
sbf.setLength(5);

// 조회
sbf.charAt(0);
sbf.length();
sbf.capacity();
sbf.substring(0, 5);
sbf.indexOf("World");
sbf.lastIndexOf("o");

// String으로 변환
String result = sbf.toString();

// Thread-safe (동기화됨)
// 멀티스레드 환경에서 안전
```

## 비교

| 클래스 | 가변성 | Thread-safe | 성능 | 사용 시기 | 
|---------|------|------|------|-----------|
| String | 불변 | O | 느림 | 변경 없는 문자열 | 
| StringBuilder | 가변 | X | 빠름 | 단일 스레드, 빈번한 수정 | 
| StringBuffer | 가변 | O | 중간 | 멀티 스레드, 빈번한 수정 | 
