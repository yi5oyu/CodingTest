import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("b"," ");
        myStr = myStr.replace("a"," ");
        myStr = myStr.replace("c"," ");
        String[] answer = myStr.split(" ");
        ArrayList<String> arrStr = new ArrayList<String>();
        for(int i = 0;i<answer.length ;i++){
            if(!answer[i].isEmpty())
                arrStr.add(answer[i]);
        }
        String[] submit = new String[arrStr.size()];
        for(int i = 0 ;i<submit.length ;i++){
            submit[i] = arrStr.get(i);
        }
        return submit;
    }
}