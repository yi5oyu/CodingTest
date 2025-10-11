import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1 ; i < n/2+1 ; i++){
            int num = i;
            for(int j = i+1 ; j < n/2+2 ; j++){
                num += j;
                if(num == n){
                    answer++;
                    break;
                } else if(num > n){
                    break;
                }
            }
        }
        return answer;
    }
}