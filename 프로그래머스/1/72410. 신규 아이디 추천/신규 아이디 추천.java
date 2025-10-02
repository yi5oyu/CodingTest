import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String ck = "";
        boolean dot = false;
        for(int i = 0 ; i < new_id.length() ; i++){
            ck +=  String.valueOf(new_id.charAt(i)).matches("[^\\-_.0-9a-zA-Z]") ? ""
                    : new_id.charAt(i) > 64 && new_id.charAt(i) < 91 ? String.valueOf((char)(new_id.charAt(i)+ 32)) : new_id.charAt(i);
            
        }
        for(int i = 0 ; i < ck.length() ; i++){
            answer += dot && ck.charAt(i) == '.' ? "" : ck.charAt(i);
                dot = ck.charAt(i) == '.' ? true : false;
        }

        while(answer.startsWith(".") || answer.endsWith(".") || answer.length() > 15 || answer.isEmpty()){
            if(answer.startsWith("."))
                answer = answer.substring(1);
            if(answer.endsWith("."))
                answer = answer.substring(0, answer.length()-1);
            if(answer.isEmpty())
                answer = "a";
            if(answer.length() > 15)
                answer = answer.substring(0,15);
            System.out.println(answer);
        }
            
        if(answer.length() < 3){
            for(int i = answer.length()-1 ; i<=(3-answer.length()) ; i++)
                answer += answer.charAt(i);
        }
        return answer;
    }
}