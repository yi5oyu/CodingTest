import java.util.*;

class Solution {
    public List solution(String[] id_list, String[] report, int k) {
        Set<String> ck = new HashSet<>();
        Map<String, List<String>> history = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for(String str : report){
            if(!ck.contains(str)){
                ck.add(str);
                String[] arr = str.split(" ");
                history.computeIfAbsent(arr[0], key -> new ArrayList<>()).add(arr[1]);
                count.merge(arr[1], 1, (oldValue, newValue) -> oldValue+1);
            }
        }
        for(String str : id_list){
            List<String> list = new ArrayList<>();
            if(history.containsKey(str))
                list = history.get(str);
            int result = 0;
            for(var name : list){
                if(count.containsKey(name) && count.get(name) >= k)
                    result++;
            }
            answer.add(result);
        }
        
        
        return answer;
    }
}