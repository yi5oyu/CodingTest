import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> strList = new ArrayList<String>();
        for(int i = 0 ; i<my_string.length() ; i++){
            String store = "";
            for(int j = i ; j<my_string.length() ;j++){
                store += "" + my_string.charAt(j);
            }
            strList.add(store);
        }
        String[] answer = new String[strList.size()];
        for(int i = 0 ; i<strList.size() ;i++){
            answer[i] = strList.get(i);
            // answer[i] = answer[i].reverse();
        }
        Arrays.sort(answer);
        return answer;
    }
}