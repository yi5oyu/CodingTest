import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String,Integer>> record = new HashMap<>();
        Map<String, Integer> giftIndex = new HashMap<>();
        for(var gift : gifts){
            String[] name = gift.split(" ");
            record.computeIfAbsent(name[0], key -> new HashMap<>())
                  .merge(name[1], 1, (oldValue, newValue) -> ++oldValue);
            giftIndex.merge(name[0], 1, (oldValue, newValue) -> ++oldValue);
            giftIndex.merge(name[1], -1, (oldValue, newValue) -> --oldValue);
        }
        for(var friend : friends){
            int result = 0;
            List<String> arr = new ArrayList<>(Arrays.asList(friends)); 
            for(var key : record.getOrDefault(friend, new HashMap<>()).keySet()){
                arr.remove(key);
                if(record.get(friend).get(key) > record.getOrDefault(key, new HashMap<>()).getOrDefault(friend, 0)){
                    result++;
                } else if(record.get(friend).get(key) == record.getOrDefault(key, new HashMap<>()).getOrDefault(friend, 0) 
                          && giftIndex.getOrDefault(friend, 0) > giftIndex.getOrDefault(key, 0)){
                    result++;
                }
            }
            for(var key : arr){
                if(record.getOrDefault(key, new HashMap<>()).get(friend) == null){
                    if(giftIndex.getOrDefault(friend, 0) > giftIndex.getOrDefault(key, 0))
                        result++;
                }
            }
            if(answer < result)
                answer = result;
        }
        return answer;
    }
}