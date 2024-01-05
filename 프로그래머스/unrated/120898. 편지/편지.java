class Solution {
    public int solution(String message) {
        int answer = 0;
        if(1 <= message.length() && message.length() <= 50){
            answer = message.length() * 2;
        }
        return answer;
    }
}