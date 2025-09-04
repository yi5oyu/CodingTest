import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++)
            arr.add(score[i]);
        Collections.sort(arr, Collections.reverseOrder());
        for(int i = 1 ; i<=arr.size()/m ;i++){
            answer+=arr.get(i*m-1)*m;
        }
        
        return answer;
    }
}