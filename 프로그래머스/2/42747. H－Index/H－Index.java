import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int index = 0;
        while(answer++ <= citations.length){
            boolean ck = true;
            for(int i = index ; i < citations.length ; i++){
                if(citations[i] >= answer){
                    ck = false;
                    if(citations.length - i < answer){
                        ck = true;
                    }
                    index = i;
                    break;
                }
            }
            if(ck){
                answer--;
                break;
            }
        }
        return answer;
    }
}