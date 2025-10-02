import java.util.*;

class Solution {
    public List solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> term = new HashMap<>();
        for(String str : terms)
            term.put(str.substring(0,1), Integer.valueOf(str.substring(2,str.length()))*28);
        int now = fromToday(today);
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < privacies.length ;i++){
            Integer day = fromToday(privacies[i].substring(0,10));
            String type = privacies[i].substring(11,12);
            if(now >= (day+term.get(type)))
                result.add(i+1);
        }
        return result;
    }
    private int fromToday(String day){
        return Integer.valueOf(day.substring(2,4))*12*28 + Integer.valueOf(day.substring(5,7))*28 + Integer.valueOf(day.substring(8,10));
    }
}