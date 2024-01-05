class Solution {
    public String solution(String myString, String pat) {
        int index = -1;
        for(int i = myString.length()-pat.length() ; i>=0 ;i--){
            if(myString.charAt(i) == pat.charAt(0)){
                int a = 1;
                for(int j = 1 ; j<pat.length();j++){
                    if(myString.charAt(i+j) == pat.charAt(j))
                        a++;
                }
                if(a==pat.length()){
                    index = i;
                    break;
                }   
            }
        }
        return myString.substring(0,index+pat.length());
    }
}