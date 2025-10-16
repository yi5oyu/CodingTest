import java.util.*;

class Solution {
    public List solution(String s) {
        List<Integer> answer = new ArrayList<>();
        s = s.substring(0, s.length()-2);
        s = s.replace("{", "");
        String[] arr = s.split("},");
        Map<Integer, List<String>> tuple = new TreeMap<>();
        for(var str : arr){
            String[] numArr = str.split(",");
            List<String> list = new ArrayList<>();
            for(var num : numArr)
                list.add(num);
            tuple.put(numArr.length, list);
        }
        for(var list : tuple.values()){
            for(var num : list){
                int i = Integer.valueOf(num);
                if(!answer.contains(i))
                    answer.add(i);
            }
        }
        
        return answer;
    }
}