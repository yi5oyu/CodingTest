class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1000000 ; 0<i ; i /=10){
            if(n/i != 0){
                answer += n/i;
                n = n%i;
            }
            
        }
        return answer;
    }
}