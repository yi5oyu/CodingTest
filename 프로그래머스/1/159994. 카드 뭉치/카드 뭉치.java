import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> card1 = new ArrayList<>();
        List<String> card2 = new ArrayList<>();
        List<String> aim = new ArrayList<>();
        for(String str : cards1)
            card1.add(str);
        for(String str : cards2)
            card2.add(str);
        for(String str : goal)
            aim.add(str);
        
        while(aim.size() > 0){
            if(card1.size() > 0 && card1.get(0).equals(aim.get(0))){
                card1.remove(0);
                aim.remove(0);
            } else if(card2.size() > 0 && card2.get(0).equals(aim.get(0))){
                card2.remove(0);
                aim.remove(0);                
            } else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}