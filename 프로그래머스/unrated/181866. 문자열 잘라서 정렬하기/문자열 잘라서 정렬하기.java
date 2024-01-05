import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> strArr = new ArrayList<String>();
        for(int i = 0 ;i<answer.length ;i++){
            if(!answer[i].isEmpty())
                strArr.add(answer[i]);
        }
        String[] submit = new String[strArr.size()];
        for(int i = 0 ;i<submit.length ;i++){
            submit[i] = strArr.get(i);
        }
        Arrays.sort(submit);
        
        return submit;
        // ArrayList<String> strlist = new ArrayList<String>();
        // for(int i = 0 ; i<answer.length ;i++){
        //     if(answer[i] != "")
        //         strlist.add(answer[i]);
        // }
        // String[] str = new String[strlist.size()];
        // for(int i = 0 ;i<strlist.size() ;i++)
        //     str[i] = strlist.get(i);
    }
}