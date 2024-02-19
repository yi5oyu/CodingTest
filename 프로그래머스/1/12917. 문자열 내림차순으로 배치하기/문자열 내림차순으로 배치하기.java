import java.util.*;

class Solution {
    public String solution(String s) {
        String str = "";
        List<Character> answer = new ArrayList<>();
        for(int i = 0 ; i<s.length() ;i++)
            answer.add(s.charAt(i));
        Collections.sort(answer, Comparator.reverseOrder());
        for(char i : answer)
            str += "" + i;
        return str;
    }
}