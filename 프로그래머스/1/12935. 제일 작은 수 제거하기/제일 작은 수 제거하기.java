import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int mins = Integer.MAX_VALUE;
        for(int i : arr)
            if(mins > i)
                mins = i;
        for(int i = 0 ; i<arr.length ; i++)
            if(arr[i] != mins)
                answer.add(arr[i]);
        if(answer.size()==0)
            answer.add(-1);
        return answer;
    }
}