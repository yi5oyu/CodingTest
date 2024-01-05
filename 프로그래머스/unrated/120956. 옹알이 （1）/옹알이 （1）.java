class Solution {
    public int solution(String[] babbling) {
        String[] say = {"aya", "ye", "woo", "ma"};
        boolean[] b = new boolean[babbling.length];
        int answer = 0;
        String a = "";
        /*
        for(int i = 0 ; i<babbling.length; i++){
            for(int j = 0 ;j<say.length;j++){

            }
        }
        */
        for(int i = 0 ;i<babbling.length;i++){
            for(int j = 0 ;j<say.length ;j++){
                if(babbling[i].contains(say[j])){
                    
                    /*
                    for(int k = 0 ; k<babbling[i].indexOf(say[j]) ;k++){
                        a += "" + babbling[i].charAt(k);
                    }
                    for(int k = babbling[i].indexOf(say[j])+say[j].length() ; k<babbling[i].length() ;k++){
                        a += "" + babbling[i].charAt(k);
                    }
                    */
                    babbling[i] = babbling[i].replace(say[j], "0");
                }
                //a = "";
            }
        }
        
        for(int i = 0 ; i<babbling.length ;i++){
            for(int j = 0 ; j<babbling[i].length();j++){
                if(!(babbling[i].charAt(j) == '0')){
                    b[i] = true;
                }
            }
        }
        for(int i = 0 ;i<b.length ;i++){
            if(b[i] == false){
                answer++;
            }
        }
        return answer;
    }
}