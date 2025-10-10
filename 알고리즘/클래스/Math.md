<div align="center">

# **Math**

수학 연산과 계산을 위한 유틸리티 클래스  
기본 연산, 최대/최소, 절댓값, 제곱/제곱근, 삼각함수

[기본 연산](#기본-연산) • [최대/최소](#최대최소) • [절댓값](#절댓값) • [제곱/제곱근](#제곱제곱근) • [올림/내림/반올림](#올림내림반올림) • [삼각함수](#삼각함수) • [난수](#난수)

</div>

## Math 클래스

`수학 연산을 위한 정적 메소드 제공(java.lang.Math)`

1. 모든 메소드가 static(객체 생성 불필요)
2. 두 개의 상수 제공: PI, E
3. 정확한 계산을 위한 StrictMath도 존재
4. Thread-safe (상태를 가지지 않음)

### 상수

```java
// Math
import java.lang.Math;// 원주율 π (파이)
Math.PI;  // 3.141592653589793// 자연로그의 밑 e
Math.E;   // 2.718281828459045
```

### 메소드

```java
// 기본 연산
Math.abs(-10);                  // 10 (절댓값)
Math.max(10, 20);               // 20 (최댓값)
Math.min(10, 20);               // 10 (최솟값)
Math.signum(-10);               // -1.0 (부호: -1, 0, 1)
Math.copySign(10, -1);          // -10.0 (10의 절댓값에 -1의 부호)

// 제곱/제곱근
Math.pow(2, 3);                 // 8.0 (2^3, 거듭제곱)
// int result = 1 << 3;         // 2의 거듭제곱은 비트 시프트가 빠름
Math.sqrt(9);                   // 3.0 (제곱근 √9)
Math.cbrt(27);                  // 3.0 (세제곱근 ∛27)
Math.hypot(3, 4);               // 5.0 (유클리드 거리 √(3²+4²))

// 올림/내림/반올림
Math.ceil(3.14);                // 4.0 (올림)
Math.floor(3.14);               // 3.0 (내림)
Math.round(3.5);                // 4 (반올림, long 반환)
Math.rint(3.5);                 // 4.0 (가장 가까운 정수, 짝수 쪽)

// 지수/로그
Math.exp(2);                    // 7.389... (e^2, 자연지수)
Math.expm1(0.001);              // 0.001... (e^x - 1, 작은 x에 정확)
Math.log(10);                   // 2.302... (ln 10, 자연로그)
Math.log1p(0.001);              // 0.000... (ln(1+x), 작은 x에 정확)
Math.log10(100);                // 2.0 (log₁₀ 100, 상용로그)

// 삼각함수
Math.toRadians(180);            // 3.141... (도 → 라디안)
Math.toDegrees(Math.PI);        // 180.0 (라디안 → 도)
Math.sin(Math.PI / 2);          // 1.0 (사인)
Math.cos(Math.PI);              // -1.0 (코사인)
Math.tan(Math.PI / 4);          // 1.0 (탄젠트)
Math.asin(0.5);                 // 0.523... (역사인, 약 30도)
Math.acos(0.5);                 // 1.047... (역코사인, 약 60도)
Math.atan(1);                   // 0.785... (역탄젠트, 약 45도)
Math.atan2(1, 1);               // 0.785... (사분면 고려 역탄젠트)
Math.sinh(1);                   // 1.175... (쌍곡선 사인)
Math.cosh(1);                   // 1.543... (쌍곡선 코사인)
Math.tanh(1);                   // 0.761... (쌍곡선 탄젠트)

// 난수
Math.random();                  // 0.0 ≤ x < 1.0 (난수)

// 정확한 연산 (오버플로우 시 예외)
Math.addExact(10, 20);          // 30
Math.subtractExact(20, 10);     // 10
Math.multiplyExact(10, 20);     // 200
Math.incrementExact(10);        // 11
Math.decrementExact(10);        // 9
Math.negateExact(-10);          // 10
Math.toIntExact(123L);          // 123 (long → int, 범위 초과 시 예외)

// 기타
Math.IEEEremainder(5, 3);       // -1.0 (IEEE 754 나머지)
Math.multiplyFull(1000000, 1000000); // 1000000000000L (long 곱셈)

// 범위 제한 (Java 21+)
// Math.clamp(15, 10, 20);      // 15 (10~20 사이로 제한)

// Java 20 이하 범위 제한
int value = 15;
int clamped = Math.max(10, Math.min(20, value)); // 15
```
