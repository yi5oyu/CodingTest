import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.contains("-")){
            s = s.substring(1);
            answer = -1*Integer.parseInt(s);
        }else
            answer = Integer.parseInt(s);
        return answer;
    }
}