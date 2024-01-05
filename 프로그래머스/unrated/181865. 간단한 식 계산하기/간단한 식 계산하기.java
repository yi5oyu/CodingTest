class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strarr = binomial.split(" ");
        
        switch (strarr[1]){
            case "+" :
                answer = Integer.parseInt(strarr[0]) + Integer.parseInt(strarr[2]);
                break;
            case "-" :
                answer = Integer.parseInt(strarr[0]) - Integer.parseInt(strarr[2]);
                break;
            case "*" :
                answer = Integer.parseInt(strarr[0]) * Integer.parseInt(strarr[2]);
                break;
        }
        return answer;
    }
}