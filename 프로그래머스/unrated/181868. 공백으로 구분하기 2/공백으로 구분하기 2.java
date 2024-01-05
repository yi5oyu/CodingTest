class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim();
        String answer = ""+ my_string.charAt(0);
        int i = 1;
        for(i = 1;i<my_string.length();i++){
            if(!(my_string.charAt(i) == ' ')){
                answer += "" + my_string.charAt(i);
            }else {
                //
                while(my_string.charAt(i) == ' '){
                    i++;    
                }
                i--;
                answer += "-";
            }
        }
        return answer.split("-");
    }
}