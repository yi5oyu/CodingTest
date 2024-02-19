import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int store = arr[0];
        answer.add(arr[0]);
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i] != store){
                store = arr[i];
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}