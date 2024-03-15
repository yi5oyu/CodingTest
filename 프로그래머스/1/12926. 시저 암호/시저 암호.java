class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int a = 0;
        for(int i = 0 ; i<s.length() ;i++){
            if(s.charAt(i) != ' '){
                if(s.charAt(i) > 96){
                    if((s.charAt(i)+n)/123 > 0)
                        answer += (char)(((s.charAt(i)+n)%123)+97);
                    else
                        answer += (char)(s.charAt(i)+n);
                } else{
                    if((s.charAt(i)+n)/91 > 0)
                        answer += (char)(((s.charAt(i)+n)%91)+65);
                    else
                        answer += (char)(s.charAt(i)+n);
                }
            }else
                answer += " ";
        }
        return answer;
    }
}