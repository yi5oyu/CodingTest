class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(1<= n && n<=100 && 2<= slice && slice <= 10){
            if(n > slice){
                answer = n / slice;
                if(n%slice != 0){
                    answer++;
                }
            } else {
                answer++;
            }
        }
        return answer;
    }
}