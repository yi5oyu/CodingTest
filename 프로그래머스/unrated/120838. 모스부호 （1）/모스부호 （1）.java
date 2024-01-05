class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] answer = letter.split(" ");
        char[] chararr = new char[answer.length];
        String submit = "";
        for(int i = 0 ;i<answer.length ;i++){
            for(int j = 0 ;j<morse.length ;j++){
                if(answer[i].equals(morse[j]))
                    chararr[i] = (char)(j+97);
            }
        }
        for(int i = 0 ;i<chararr.length ;i++){
            submit += ""+ chararr[i];
        }
        return submit;
    }
}