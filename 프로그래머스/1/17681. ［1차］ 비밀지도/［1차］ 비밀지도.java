import java.util.*;

class Solution {
    static int len;
    
    public List solution(int n, int[] arr1, int[] arr2) {
        len = n;
        List<String> answer = new ArrayList<>();
        for(int i = 0 ; i<len ;i++)
            answer.add(sum(code(arr1[i]), code(arr2[i])));  
        return answer;
    }
    
    
    String sum(String a, String b){
        String answer = "";
        for(int i = 0 ; i<a.length() ;i++){
            if((a.charAt(i) == '1') || (b.charAt(i) == '1'))
                answer += "#";
            else
                answer += " ";
        }    
        return answer;
    }
    
    String code(int num){
        String answer = "";
        while(num > 0){
            answer = num%2 + answer;
            num/=2;    
        }
        while(answer.length() < len)
            answer = "0"+answer;
        return answer;
    }
}