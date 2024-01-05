class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        /*
        for(int i = 0 ; i<str_list.length;i++){
            if(str_list[i].length() >= ex.length()){
                if(str_list[i].charAt(str_list[i].length() - ex.length()) == ex.charAt(0)){
                    if(str_list[i].contains(ex)){
                        answer += "";
                    } else
                        answer += str_list[i];
                } else
                    answer += str_list[i]; 
            } else
                answer += str_list[i];
        }
        */
        for(int i = 0 ;i<str_list.length ;i++){
            if(!(str_list[i].contains(ex))){
                answer += str_list[i];
            }
        }
        return answer;
    }
}