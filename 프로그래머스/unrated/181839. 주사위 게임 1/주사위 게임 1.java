class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a%2 != 0 && b%2 != 0){
            return answer = a*a + b*b;
        } else if(a%2 == 0 && b%2 == 0){
            if(a > b){
                return answer = a - b;
            } else
                return answer = b - a;
        } else {
            return answer = 2*(a+b);
        }
    }
}