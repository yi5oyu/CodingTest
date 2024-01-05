class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for(int i = 0 ;i<code.length() ;i++){
            while(code.charAt(i) == '1'){ //code.contains('1')
                mode = !mode;
                if(i == code.length()-1){
                    if(answer == ""){
                        return "EMPTY";
                    }else
                        return answer;
                }
                i++;
            }
            if(mode){
                if(i%2 == 0)
                    answer += "" + code.charAt(i);
            } else
                if(i%2 != 0)
                    answer += "" + code.charAt(i);
        }
        return answer;
    }
}