class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0 ; i<myString.length() ;i++){
            if(myString.charAt(i) < 96){
                answer += "" + (char)((int)myString.charAt(i) + 32);
            } else
                answer += "" + myString.charAt(i);
        }
        return answer;
    }
}