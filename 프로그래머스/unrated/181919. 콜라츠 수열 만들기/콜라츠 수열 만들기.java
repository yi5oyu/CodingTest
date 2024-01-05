class Solution {
    //Integer.parseInt();
    public int[] solution(int n) {
        int a = n;
        String answer = "" + a;
        while(a>1){
            if(a%2 == 0){ 
                a /= 2;
            } else
                a = 3*a+1;
            answer += "-" + a; 
        }
        int[] intarr = new int[answer.split("-").length];
        intarr[0] = n;
        for(int i = 1 ; i<intarr.length;i++){
            if(n%2 == 0){
                n /= 2;
            } else {
                n = 3*n+1;
            }
            intarr[i] = n;    
        }
        return intarr;
    }
}