class Solution {
    public int solution(String myString, String pat) {
        int answer = 0; //65
        String ch = "";
        for(int i = 0 ;i< myString.length() ;i++){
            if(myString.charAt(i) == 'A'){
                ch += "" +(char)((int)myString.charAt(i)+1);
            } else {
                ch += "" +(char)((int)myString.charAt(i)-1);
            }
        }
        
        int len = 1;
        if(myString.length() >= pat.length()){
            for(int i = 0 ; i<=myString.length() -pat.length() ;i++){
                if(ch.charAt(i) == pat.charAt(0)){
                    for(int j = 1 ; j<pat.length() ;j++){
                        if(ch.charAt(i+j) == pat.charAt(j)){
                            len++;
                        }
                    }
                    if(len == pat.length()){
                        return 1;
                    }
                    len = 1;
                }
            }
        } else{
                return 0;
        }

        return answer;
    }
}