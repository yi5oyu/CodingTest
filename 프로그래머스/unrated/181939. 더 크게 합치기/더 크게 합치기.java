class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = "";
        String strB = "";
        int resultA = 0;
        int resultB = 0;
        for(int i = 1000 ;i>0 ; i/=10){
            if(a/i != 0){
                resultB = i*10;
                break;
            }
        }
        for(int i = 1000 ;i>0 ; i/=10){
            if(b/i != 0){
                resultA = i*10;
                break;
            }
        }
        resultA *= a;
        resultA += b;
        resultB *= b;
        resultB += a;
        if(resultA >= resultB){
            return resultA;
        } else
            return resultB;
    }
}