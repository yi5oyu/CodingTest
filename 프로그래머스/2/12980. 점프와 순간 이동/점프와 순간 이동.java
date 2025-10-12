import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 1;
        while(n > 1){
            int times = 1;
            int num = 0;
            while(n > times){
                times = 1 << num++;
                if(n == times)
                    return answer;
            }
            n -= times >> 1;
            answer++;
        }
        return answer;
    }
}