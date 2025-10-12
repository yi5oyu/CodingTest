import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int times = 1;
        int ck = 0;
        while(ck < arr.length){
            ck = 0;
            answer = arr[arr.length-1]*times++;
            for(var n : arr)
                ck += answer%n == 0 ? 1 : 0;
        }
        return answer;
    }
}