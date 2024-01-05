class Solution {
    public String solution(String n_str) {
        String answer = "";
        int len = n_str.length();
        for(int i = 0 ; i<n_str.length() ; i++){
            if((int)n_str.charAt(i) != 48){
                for(int j = i ;j<n_str.length() ;j++){
                    answer += "" + n_str.charAt(j);
                }
                return answer;
            }
        }
        return answer;
    }
}