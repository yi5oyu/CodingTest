class Solution {
    public int solution(int n) {
        int answer = 0;
        if(1<= n && n <= 100){
            answer = n/7;
            if(n%7 != 0){
                answer += 1;
            }
        }
        return answer;
    }
}