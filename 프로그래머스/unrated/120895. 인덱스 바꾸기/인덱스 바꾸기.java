class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arrchar = new char[my_string.length()];
        char num1_char = my_string.charAt(num1);
        char num2_char = my_string.charAt(num2);
        for(int i = 0 ; i<my_string.length();i++){
            arrchar[i] = my_string.charAt(i);
        }
        arrchar[num2] = num1_char;
        arrchar[num1] = num2_char;
        for(int i = 0 ; i<arrchar.length ;i++){
            answer += ""+arrchar[i];
        }
        return answer;
    }
}