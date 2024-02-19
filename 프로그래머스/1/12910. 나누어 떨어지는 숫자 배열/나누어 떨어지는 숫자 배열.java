import java.util.*;

class Solution {
    public List solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]%divisor == 0)
                answer.add(arr[i]);
        }
        Collections.sort(answer);
        if(answer.size() == 0)
            answer.add(-1);
        return answer;
    }
}