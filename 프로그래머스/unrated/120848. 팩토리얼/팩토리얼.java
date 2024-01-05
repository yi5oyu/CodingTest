class Solution {
    public int solution(int n) {
        int answer = 1;
        int i = 1;
        if(n == i){
            return i;
        }
        for(i = 2 ; i<=10 ;i++){
            n = n/i; //+ n%i;
            if(n/i == 0){
                return i;
            }
        }
        return i;
        
    }
}