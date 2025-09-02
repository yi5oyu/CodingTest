import java.util.*;

class Solution {
    public List solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> result = new ArrayList<>(); 
        for(int i = 0 ; i < score.length ; i++){
            answer.add(score[i]);
            Collections.sort(answer, Collections.reverseOrder());
            if(answer.size() < k){
                result.add(answer.get(i));
            } else{
                result.add(answer.get(k-1));
            }
        }
        
        return result;
    }
}