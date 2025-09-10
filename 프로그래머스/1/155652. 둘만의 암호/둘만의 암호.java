import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Integer> arr = new ArrayList<>();
        for(int i = 97 ; i < 123 ; i++)
            arr.add(i);
        for(int i = 0 ; i < skip.length() ; i++)
            arr.remove(Integer.valueOf(skip.charAt(i)));
        for(int i = 0 ; i < s.length() ; i++){
            int lang = (int)s.charAt(i);
            int indexof = arr.indexOf(Integer.valueOf(lang));
            int a = (int)(arr.get((indexof+index)%arr.size()));
            answer += ""+(char)a;
        }
        return answer;
    }
}