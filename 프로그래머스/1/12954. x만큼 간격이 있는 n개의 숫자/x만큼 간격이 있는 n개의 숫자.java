import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long l = x;
        long[] answer = new long[n];
        for(int i = 1 ; i<=n ;i++)
            answer[i-1] = l*i;
        return answer;
    }
}