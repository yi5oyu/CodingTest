import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String store ="";
        for(int i = 0 ; i<my_string.length();i++){
            if(my_string.charAt(i) > 64){
                store += " ";
            } else
                store += ""+my_string.charAt(i);
        }
        String[] strarr = store.split(" ");
        ArrayList<String> strList = new ArrayList<String>();
        for(int i = 0 ;i<strarr.length ;i++){
            if(!strarr[i].isEmpty())
                strList.add(strarr[i]);
        }
        for(int i = 0 ; i<strList.size() ;i++)
            answer += Integer.parseInt(strList.get(i));
        return answer;
    }
}