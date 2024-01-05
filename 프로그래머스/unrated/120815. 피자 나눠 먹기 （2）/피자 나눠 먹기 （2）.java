class Solution {
    public int solution(int n) {
        int answer = 0;
        //6의 배수로 나눠지는가?
        for(int i = 1 ; i<101;i++){
            if((i*6) % n == 0){
                answer = i;
                break;
            } 
        }
        return answer;
    }
}