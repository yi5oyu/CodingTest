class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        String[] answer = {};
        for(int i=0 ;i<quiz.length ;i++){
            answer = quiz[i].split(" ");
            if(answer[1].charAt(0) == '+'){
                if(Integer.valueOf(answer[0]) + Integer.valueOf(answer[2]) 
                   == Integer.valueOf(answer[4])){
                    result[i] = "O";
                } else
                    result[i] = "X";
            } else {
                if(Integer.valueOf(answer[0]) - Integer.valueOf(answer[2]) 
                   == Integer.valueOf(answer[4])){
                    result[i] = "O";
                } else
                    result[i] = "X";
            } 
        }
        return result;
    }
}