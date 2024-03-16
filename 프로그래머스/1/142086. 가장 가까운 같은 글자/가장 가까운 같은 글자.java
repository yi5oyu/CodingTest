import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> m = new HashMap<>();
        String num = "";
        for(int i = 0 ; i<s.length() ;i++){
            num = ""+m.putIfAbsent(""+s.charAt(i),i);
            if(num.equals("null")){
                answer[i] = -1;
            } else{
                answer[i] = i - m.get(""+s.charAt(i));
                m.put(""+s.charAt(i),i);
            }
        }
        return answer;
    }
}