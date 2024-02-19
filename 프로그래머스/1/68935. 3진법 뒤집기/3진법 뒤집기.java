class Solution {
    static String str = "";
    public int solution(int n) {
        div(n);
        int a = 0;
        int b = 0;
        for(int i = str.length()-1 ; i>=0 ;i--){
            a += (str.charAt(i)-48)*Math.pow(3,b++);
        }
        return a;
    }
    public void div(int n){
        if(n<3){
            str += n;
            return ;
        }
        str += n%3;
        div(n/3);
    }
}