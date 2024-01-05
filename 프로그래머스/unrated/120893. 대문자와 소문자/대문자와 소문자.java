class Solution {
    public String solution(String my_string) {
        String answer = "";
        //65 97 32
        for(int i = 0 ; i<my_string.length() ; i++){
            if((int)my_string.charAt(i) < 95){
                answer += ""+ (char)((int)my_string.charAt(i)+32);
            } else {
                int a=(int)my_string.charAt(i);
                answer += ""+ (char)((int)my_string.charAt(i)-32);
            }
                
        }
        return answer;
    }
}