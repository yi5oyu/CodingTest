class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.toUpperCase().contains(pat.toUpperCase())){
            return 1;
        } else
            return 0;
        /*
        int answer = 0;
        String word1 = "";
        String word2 = "";
        for(int i = 0 ; i<myString.length() ;i++){
            if(myString.charAt(i) < 96){
                word1 += "" + (char)((int)myString.charAt(i) + 32);
            } else{
                word1 += "" + myString.charAt(i);
            }
        }
        for(int i = 0 ; i<pat.length() ;i++){
            if(pat.charAt(i) < 96){
                word2 += "" + (char)((int)pat.charAt(i) + 32);
            } else{
                word2 += "" + pat.charAt(i);
            }
        }
        int len = 1;
        int sign = 0;
        boolean b = false;

         if(myString.length()>=pat.length()){
            for(int i = 0 ; i<myString.length()-pat.length()+1 ; i++){
                if((int)word1.charAt(i) == (int)word2.charAt(0)){
                    len = 1;
                    for(int j = 1 ;j<pat.length() ;j++){
                        if((int)word2.charAt(j) == (int)word1.charAt(i+j)){
                            len++;
                            // 우연히 문자배열이 같은 경우
                            // len가늘어나 false가될 수 있음
                        }
                        if(len == pat.length()){
                            return 1;
                        }
                    }
                }
            } 
        } else
            return 0;
        
        if(b){
            return 1;
        } else
            return 0;
        */
    }
}