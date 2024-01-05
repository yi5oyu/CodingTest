class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0;
        String[] strarr = s.split(" ");
        for(int i = strarr.length-1 ;i>=0 ;i--){
            if(strarr[i].charAt(0) == 'Z'){
                i--;
            } else{
               answer += Integer.valueOf(strarr[i]);
            }
            
        }
        return answer;
    }
}