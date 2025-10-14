import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> count = new HashMap<>();
        for(int i = 0 ; i < number.length ; i++)
            count.put(want[i], number[i]);
        for(int i = 0 ; i <= discount.length-10 ; i++){
            boolean ck = true;
            Map<String, Integer> box = new HashMap<>();
            for(int j = i ; j < i+10 ; j++){
                String item = discount[j];
                box.merge(item, 1, (oldValue, newValue) -> ++oldValue);
                if(!count.containsKey(item) || count.get(item) < box.get(item)){
                    ck = false;
                    break;
                }
            }
            if(ck)
                answer++;
        }
        return answer;
    }
}