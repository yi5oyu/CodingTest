<div align="center">

# **Hash**

데이터를 고정된 크기의 고유한 값으로 변환하는 방법
빠른 검색 O(1), 중복 검사, 데이터 그룹핑, 캐싱 

[해시 함수](#해시-함수hash-function) • [해시 테이블](#해시-테이블) • [HashMap](#hashmap) • [HashSet](#hashset) • [LinkedHashMap](#linkedhashmap) • [TreeMap](#treemap)

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

```
10개의 버킷 배열, 4개의 엔트리(Key-Value 쌍을 저장하는 객체, next 포인터)        
┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐            
│ 0 │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │ - 인덱스         
├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤               
│   │   │ C │ B │   │   │   │ A │   │ E │ - 데이터              
└───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘            
```

### 해시 충돌

`서로 다른 키가 같은 해시값을 가지는 현상`

```
비둘기집 원리
 - 가능한 키의 수 > 버킷의 수
생일 패러독스
 - 23명만 있어도 생일 같을 확률 50%
```
