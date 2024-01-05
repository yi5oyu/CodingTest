class Solution {
    public String solution(String myString) {
        String answer = ""; // a 97 32 65A
        
        for(int i = 0 ;i<myString.length() ;i++){
            if((int)myString.charAt(i) == 97){
                answer += "" + (char)((int)myString.charAt(i) - 32);
            } else if(myString.charAt(i) == ' '){
                answer += "" + myString.charAt(i);
            } else if((int)myString.charAt(i) < 96 && (int)myString.charAt(i) != 65){
                answer += "" + (char)((int)myString.charAt(i) + 32);
            } else {
                answer += "" + myString.charAt(i);
            }
        }
        return answer;
    }
}