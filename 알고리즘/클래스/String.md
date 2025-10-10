# String

`불변 객체`: 한번 생성되면 내부 값을 변경할 수 없음, 모든 메소드는 새 객체를 반환

1. 문자열 리터럴(큰따옴표(")로 감싼 문자열)은 String Pool(JVM의 Heap 메모리 영역)에 저장됨, 같은 리터럴은 같은 객체를 참조(메모리 절약)
2. thread-safe: 여러 스레드가 동시에 접근해도 안전, 데이터 충돌이나 예상치 못한 결과가 발생하지 않음
3. 해시코드 캐싱: 한 번 계산한 해시코드를 저장해두고 재사용(HashMap 등에서 키로 사용 시 효율적)

## 메소드

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
