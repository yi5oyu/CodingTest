class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0 ; i<my_string.length() ;i++){
            if( (int)my_string.charAt(i) == (int)alp.charAt(0) ){
                answer += "" + (char)((int)alp.charAt(0)-32);
            } else{
                answer += "" + my_string.charAt(i);
            }
                
        }
        
        return answer;
    }
}