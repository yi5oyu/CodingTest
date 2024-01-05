class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean score = false;
        for(int i = 4 ; i<=n;i++){
            int count = 0;
            for(int j = 1 ; j <= i ;j++){
                if(i%j == 0){
                    count++;
                    if(count >2){
                        score=true;
                    }
                }
            }
            if(score){
                answer++;
            }
            score = false;
        }
        return answer;
    }
}