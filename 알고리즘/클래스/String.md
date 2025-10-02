# String

## 메소드

```java
String str = "AaBbCc";
// 문자열 길이 | int length()
str.length(); // 6

// 빈 문자열 여부 | boolean isEmpty()
str.isEmpty(); // false

// 내용 비교 boolean equals(Object obj)
str.equals("AaBbCc"); // true

// 대소문자 무시 비교 boolean equalsIgnoreCase(String)

// 비교(사전) int compareTo(String)

// index 위치의 문자 | char charAt(int index)
            
// 문자열 첫 등장 위치 | int indexOf(String str)
     
// 문자열 마지막 등장 위치 | int lastIndexOf(String str)
   
// 포함 여부 | boolean contains(CharSequence s)

// 시작 문자열 확인 | boolean startsWith(String prefix)
  
// 끝 문자열 확인 | boolean endsWith(String suffix)
    
// 정규식 매칭 | boolean matches(String regex)       

String substring(int begin)            // begin부터 끝까지
String substring(int begin, int end)   // begin~end-1까지
String[] split(String regex)           // 정규식으로 분할
String[] split(String regex, int limit) // 최대 limit개로 분할

String toLowerCase()           // 소문자 변환
String toUpperCase()           // 대문자 변환
String trim()                  // 앞뒤 공백 제거
String strip()                 // 앞뒤 공백 제거(유니코드, Java 11+)
String replace(char old, char new)        // 문자 치환
String replace(String old, String new)    // 문자열 치환
String replaceAll(String regex, String s) // 정규식 치환
String replaceFirst(String regex, String s) // 첫 매칭만 치환
char[] toCharArray()           // char 배열로 변환

String concat(String str)      // 문자열 연결
String join(String delimiter, String... strs) // 구분자로 결합


static String format(String format, Object... args) // printf 스타일
static String valueOf(...)     // 다양한 타입을 String으로

// 공백만 있는지 boolean isBlank() (Java 11+)
str.isBlank(); // false

// 반복 String repeat(int count) (Java 11+)


```
