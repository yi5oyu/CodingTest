<div align="center">

# **BigInteger**
임의 정밀도 정수 연산을 위한 클래스    
int/long 범위를 초과하는 큰 정수 처리

[생성](#생성) • [기본 연산](#기본-연산) • [비교](#비교) • [비트 연산](#비트-연산) • [함수](#함수) • [변환](#변환)

</div>

---

## BigInteger 클래스

`임의 정밀도 정수 연산을 위한 클래스 (java.math.BigInteger)`

1. int, long 범위를 초과하는 큰 정수 처리
2. 불변(Immutable) 객체 - 연산 시 새 객체 반환
3. 암호화, 보안, 대용량 계산에 사용
4. Thread-safe

```java
// import 필요
import java.math.BigInteger;

// int/long 범위
int maxInt = Integer.MAX_VALUE;        // 2,147,483,647 (약 21억)
long maxLong = Long.MAX_VALUE;         // 9,223,372,036,854,775,807

// BigInteger는 제한 없음
BigInteger huge = new BigInteger("999999999999999999999999999999");
```

## 생성

```java
import java.math.BigInteger;

// 문자열로 생성
BigInteger bi1 = new BigInteger("123456789012345678901234567890");

// long 값으로 생성
BigInteger bi2 = BigInteger.valueOf(100);

// 2진수, 8진수, 16진수 문자열
BigInteger bi3 = new BigInteger("FF", 16);      // 255
BigInteger bi4 = new BigInteger("1010", 2);     // 10
BigInteger bi5 = new BigInteger("77", 8);       // 63

// 상수
BigInteger zero = BigInteger.ZERO;              // 0
BigInteger one = BigInteger.ONE;                // 1
BigInteger two = BigInteger.TWO;                // 2 (Java 9+)
BigInteger ten = BigInteger.TEN;                // 10

// 난수 생성
BigInteger random = new BigInteger(100, new java.util.Random()); // 100비트 난수
```

## 기본 연산

```java
BigInteger a = new BigInteger("100");
BigInteger b = new BigInteger("50");

// 사칙연산
a.add(b);                       // 150 (덧셈)
a.subtract(b);                  // 50 (뺄셈)
a.multiply(b);                  // 5000 (곱셈)
a.divide(b);                    // 2 (나눗셈, 몫만)
a.remainder(b);                 // 0 (나머지)

// 몫과 나머지 동시에
BigInteger[] result = a.divideAndRemainder(b);
// result[0]: 몫
// result[1]: 나머지

// 부호 연산
a.negate();                     // -100 (부호 반전)
a.abs();                        // 100 (절댓값)
a.signum();                     // 1 (부호: -1, 0, 1)

// 거듭제곱
a.pow(3);                       // 1000000 (100^3)
a.modPow(b, new BigInteger("7")); // (100^50) mod 7 (모듈로 거듭제곱)

// 증가/감소
a.add(BigInteger.ONE);          // 101 (증가)
a.subtract(BigInteger.ONE);     // 99 (감소)
```

## 비교

```java
BigInteger a = new BigInteger("100");
BigInteger b = new BigInteger("50");

// compareTo(권장)
a.compareTo(b);                 // 1 (a > b: 양수, a == b: 0, a < b: 음수)

// 비교 예제
if (a.compareTo(b) > 0) {
    System.out.println("a가 더 큼");
} else if (a.compareTo(b) == 0) {
    System.out.println("같음");
} else {
    System.out.println("b가 더 큼");
}

// equals(값 비교)
a.equals(b);                    // false

// 사용 금지(참조 비교)
a == b;                         // false (다른 객체)

// 최댓값/최솟값
a.max(b);                       // 100 (최댓값)
a.min(b);                       // 50 (최솟값)
```

## 비트 연산

```java
BigInteger a = new BigInteger("12");  // 1100₂
BigInteger b = new BigInteger("10");  // 1010₂

// 논리 연산
a.and(b);                       // 8 (1000₂, AND)
a.or(b);                        // 14 (1110₂, OR)
a.xor(b);                       // 6 (0110₂, XOR)
a.not();                        // -13 (NOT, 2의 보수)
a.andNot(b);                    // 4 (0100₂, a AND (NOT b))

// 시프트 연산
a.shiftLeft(2);                 // 48 (왼쪽 시프트, × 4)
a.shiftRight(2);                // 3 (오른쪽 시프트, ÷ 4)

// 비트 정보
a.bitCount();                   // 2 (1의 개수)
a.bitLength();                  // 4 (비트 길이)
a.getLowestSetBit();            // 2 (가장 낮은 1비트 위치)

// 비트 조작
a.testBit(2);                   // true (2번 비트가 1인지)
a.setBit(0);                    // 13 (0번 비트를 1로)
a.clearBit(2);                  // 8 (2번 비트를 0으로)
a.flipBit(0);                   // 13 (0번 비트 반전)
```

## 함수

```java
BigInteger a = new BigInteger("16");
BigInteger b = new BigInteger("12");

// 최대공약수
a.gcd(b);                       // 4 (GCD)

// 제곱근 (Java 9+)
a.sqrt();                       // 4 (제곱근)
BigInteger[] sqrtResult = a.sqrtAndRemainder();
// sqrtResult[0]: 제곱근 (4)
// sqrtResult[1]: 나머지 (0)

// 모듈로 연산
a.mod(new BigInteger("5"));     // 1 (양수 나머지)
a.modInverse(new BigInteger("7")); // 모듈로 역원

// 참고: remainder vs mod
new BigInteger("-10").remainder(new BigInteger("3")); // -1
new BigInteger("-10").mod(new BigInteger("3"));       // 2 (항상 양수)
```

## 변환

```java
BigInteger bi = new BigInteger("123456");

// 기본 타입으로 변환
bi.intValue();                  // 123456 (int)
bi.longValue();                 // 123456L (long)
bi.floatValue();                // 123456.0f (float)
bi.doubleValue();               // 123456.0 (double)

// 정확한 변환 (범위 초과 시 ArithmeticException)
bi.intValueExact();             // 123456
bi.longValueExact();            // 123456L
bi.shortValueExact();           // 범위 초과 시 예외
bi.byteValueExact();            // 범위 초과 시 예외

// 문자열 변환
bi.toString();                  // "123456" (10진수)
bi.toString(2);                 // "11110001001000000" (2진수)
bi.toString(8);                 // "361100" (8진수)
bi.toString(16);                // "1e240" (16진수)

// 바이트 배열
byte[] bytes = bi.toByteArray(); // 빅엔디안 방식
BigInteger restored = new BigInteger(bytes);
```
