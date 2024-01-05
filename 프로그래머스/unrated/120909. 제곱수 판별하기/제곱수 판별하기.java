class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean sign = false;
        for(int i = 1 ; i<= 1000 ;i++){
            if(n == i*i){
                sign = true;
            }
        }
        if(sign){
            return answer = 1;    
        } else {
            return answer = 2;
        }
        
    }
}