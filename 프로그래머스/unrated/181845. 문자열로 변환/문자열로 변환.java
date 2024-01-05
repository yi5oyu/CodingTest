class Solution {
    public String solution(int n) {
        String answer = ""; // 48 0
        int a = 1;
        for(int i = 10000 ; i>=1 ; i /= 10){
            if(n/i != 0 || a == 0){
                answer += "" + (n / i);
                n = n%i;
                a = 0;
            } else if(i == 1){
                answer += "" + n%10;
            } // 9020 
        }
        return answer;
    }
}