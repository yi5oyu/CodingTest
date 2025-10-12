import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> type = new HashMap<>();
        Map<Integer, Integer> num = new TreeMap<>(Collections.reverseOrder());
        for(var size : tangerine)
            type.merge(size, 1, (oldValue, newValue) -> ++oldValue);
        for(var value : type.values())
            num.merge(value, 1, (oldValue, newValue) -> ++oldValue);
        for(var key : num.keySet()){
            for(int i = 0 ; i < num.get(key) ; i++){
                k -= key;
                answer++;
                if(k <= 0)
                    return answer;
                
            }             
        }
        return answer;
    }
}