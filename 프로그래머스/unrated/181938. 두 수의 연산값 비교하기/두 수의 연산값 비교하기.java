class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // 2905 152. 3번째 자리수
        for(int i = 1000 ; i>0 ;i/=10){
            if(b/i != 0){
                answer = i*10;
                break;
            }
        }
        answer *= a;
        answer += b;
        if(answer > 2*a*b){
            return answer;
        } else
            return 2*a*b;
    }
}