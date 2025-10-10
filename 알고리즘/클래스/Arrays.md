<div align="center">

# **Arrays**

배열을 다루기 위한 유틸리티 클래스  
정렬, 검색, 복사, 비교, 채우기

</div>

## Arrays 클래스

`배열 조작을 위한 정적 메소드 제공 (java.util.Arrays)`

1. 모든 메소드가 static (객체 생성 불필요)
2. 기본 타입 배열과 객체 배열 모두 지원
3. 대부분의 메소드는 배열을 직접 수정

## 메소드

```java
// Arrays
import java.util.Arrays;

int[] arr = {5, 2, 8, 1, 9};

// 정렬
Arrays.sort(arr);                           // [1, 2, 5, 8, 9] (오름차순)
Arrays.sort(arr, 1, 4);                     // 부분 정렬 (1~3 인덱스)

Integer[] arr2 = {5, 2, 8, 1, 9};
Arrays.sort(arr2, Collections.reverseOrder()); // [9, 8, 5, 2, 1] (내림차순)
Arrays.sort(arr2, (a, b) -> b - a);         // 커스텀 정렬

Arrays.parallelSort(arr);                   // 병렬 정렬 (큰 배열에 효율적)

// 검색(정렬 후 검색 해야함)
int[] sorted = {1, 2, 5, 8, 9};
Arrays.binarySearch(sorted, 5);             // 2 (인덱스, 정렬 필수)
Arrays.binarySearch(sorted, 3);             // -3 (없으면 음수)
Arrays.binarySearch(sorted, 1, 4, 5);       // 부분 검색 (1~3 인덱스)

// 복사(깊은 복사)
Arrays.copyOf(arr, arr.length);             // [5, 2, 8, 1, 9] (전체 복사)
Arrays.copyOf(arr, 3);                      // [5, 2, 8] (크기 지정)
Arrays.copyOf(arr, 7);                      // [5, 2, 8, 1, 9, 0, 0] (부족하면 0)
Arrays.copyOfRange(arr, 1, 4);              // [2, 8, 1] (1~3 인덱스)

// 비교
int[] arr3 = {1, 2, 3};
int[] arr4 = {1, 2, 3};
Arrays.equals(arr3, arr4);                  // true (내용 비교)
Arrays.compare(arr3, arr4);                 // 0 (사전순 비교)
Arrays.equals(arr3, 0, 2, arr4, 0, 2);      // 부분 비교 (0~1 인덱스)
Arrays.mismatch(arr3, arr4);                // -1 (불일치 첫 인덱스, 같으면 -1)

int[][] arr2d1 = {{1, 2}, {3, 4}};
int[][] arr2d2 = {{1, 2}, {3, 4}};
Arrays.deepEquals(arr2d1, arr2d2);          // true (다차원 비교)

// 채우기
Arrays.fill(arr, 10);                       // [10, 10, 10, 10, 10] (전체)
Arrays.fill(arr, 1, 3, 20);                 // [10, 20, 20, 10, 10] (1~2 인덱스)
Arrays.setAll(arr, i -> i * 2);             // [0, 2, 4, 6, 8] (인덱스 기반)
Arrays.parallelSetAll(arr, i -> i * i);     // [0, 1, 4, 9, 16] (병렬)

int[] arr5 = {1, 2, 3, 4, 5};
Arrays.parallelPrefix(arr5, (a, b) -> a + b); // [1, 3, 6, 10, 15] (누적 연산)

// 변환
Arrays.toString(arr);                       // "[5, 2, 8, 1, 9]" (문자열)
Arrays.deepToString(arr2d1);                // "[[1, 2], [3, 4]]" (다차원)

Integer[] arr6 = {1, 2, 3};
// asList() 결과는 고정 크기 (add/remove 불가)
List<Integer> list = Arrays.asList(arr6);   // [1, 2, 3]

// Stream
Arrays.stream(arr);                         // IntStream 생성
Arrays.stream(arr).sum();                   // 합계
Arrays.stream(arr).max().getAsInt();        // 최댓값
Arrays.stream(arr).min().getAsInt();        // 최솟값
Arrays.stream(arr).average().getAsDouble(); // 평균
Arrays.stream(arr).sorted().toArray();      // 정렬 후 배열

// 해시코드
Arrays.hashCode(arr);                       // 배열 해시코드
Arrays.deepHashCode(arr2d1);                // 다차원 해시코드
```

