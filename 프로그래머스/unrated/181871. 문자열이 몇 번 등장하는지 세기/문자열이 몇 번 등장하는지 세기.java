class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        //길이
        for(int i = 0 ;i<=myString.length()-pat.length() ;i++){
            if(myString.charAt(i) == pat.charAt(0)){
                int a =1;
                for(int j=1;j<pat.length();j++){
                    if(myString.charAt(i+j) != pat.charAt(j))
                        break;
                    a++;
                }
                if(a==pat.length())
                    answer++;
            }
        }
        return answer;
    }
}