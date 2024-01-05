class Solution {
    public String[] solution(String my_string) {
        int len = 1;
        for(int i = 0 ; i<my_string.length() ;i++){
            if(my_string.charAt(i) == ' '){
                len++;
            }
        }
        String[] answer = new String[len];
        for(int i = 0 ; i<answer.length ;i++){
            answer[i] = "";
        }
        int j = 0;
        for(int i = 0 ; i<my_string.length() ;i++){
            if(my_string.charAt(i) != ' '){
                answer[j] += "" +  my_string.charAt(i);
            } else
                j++;
        }
        return answer;
    }
}