import java.util.*;

class Solution {
    public List solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i : numbers)
            arr.add(i);
        while(arr.size() > 1){
            int num = arr.remove(0);
            for(int i=0 ; i<arr.size() ;i++){
                int judge = num + arr.get(i);
                if(!answer.contains(judge))
                    answer.add(judge);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}