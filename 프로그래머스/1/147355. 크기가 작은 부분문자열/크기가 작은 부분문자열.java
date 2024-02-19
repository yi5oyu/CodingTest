import java.util.*;

class Solution {
    public long solution(String t, String p) {
        int len = p.length();
        long pp = Long.parseLong(p);
        long answer = 0;
        for(int i = 0 ; i<t.length()-len+1 ;i++){
            String str = "";
            for(int j = 0; j<len ;j++)
                str += "" + t.charAt(i+j);
            if(Long.parseLong(str) <= pp)
                answer++;
        }
        return answer;
    }
}