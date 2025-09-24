import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> type = new HashMap<>();
        String[] types = {"R","T","C","F","J","M","A","N"};
        
        for(int i = 0 ; i < types.length ; i++)
            type.put(types[i],0);
        
        for(int i = 0 ; i < survey.length ; i++){
            String P = "";
            int score = 0;
            if(choices[i] >= 4){
                score = choices[i]%4;
                type.merge((""+survey[i].charAt(1)), score, (value, newValue) -> value + newValue);
            } else {
                score = 4-choices[i];
                type.merge((""+survey[i].charAt(0)), score, (value, newValue) -> value + newValue);
            }
        }
        answer += type.get("R") >= type.get("T") ? "R" : "T";
        answer += type.get("C") >= type.get("F") ? "C" : "F";
        answer += type.get("J") >= type.get("M") ? "J" : "M";
        answer += type.get("A") >= type.get("N") ? "A" : "N";
        return answer;
    }
}