class Solution {
    public int solution(String n_str) {
        int answer = 0; // 48 0
        int store = 1;
        for(int i = 0 ; i<n_str.length()-1 ;i++){
            store *= 10;
        }
        
        for(int i = 0 ;i<n_str.length() ; i++){
            answer += (n_str.charAt(i)-48) * store;
            store /= 10;
        }
        return answer;
    }
}