class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0 ; i<number.length() ;i++){
            answer += (int)number.charAt(i)-48;
        }
        answer %= 9; 
        return answer;
    }
}