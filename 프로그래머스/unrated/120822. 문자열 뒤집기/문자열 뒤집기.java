class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arrchar = new char[my_string.length()];
        for(int i = 0 ; i< my_string.length(); i++){
            arrchar[i] = my_string.charAt(i);
        }
        for(int i = arrchar.length - 1 ; 0 <= i ; i--){
            answer += ""+arrchar[i];
        }
        return answer;
    }
}