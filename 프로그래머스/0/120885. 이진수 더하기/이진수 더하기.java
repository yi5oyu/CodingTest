class Solution {
    public static String ans = "";
    public String solution(String bin1, String bin2) {
        int answer = 0;
        answer += sums(bin1);
        answer += sums(bin2);
        tobin(answer);
        return ans;
    }
    public int sums(String bin){
        int answer = 0;
        int a = 0;
        for(int i = bin.length()-1, z = 0 ; i>=0 ;i--,z++){
            a = bin.charAt(i) - 48;
            for(int j = 0 ; j<z ;j++)
                a *= 2;
            answer += a;
        }
        return answer;
    }
    public void tobin(int a){
        if(a<2){
            ans = a + "" + ans;
            return;
        }
        ans = (a%2) + "" + ans;
        tobin(a/2);
    }
}