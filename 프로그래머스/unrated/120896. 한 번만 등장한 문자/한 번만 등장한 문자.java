class Solution {
    public String solution(String s) {
        String answer = "";
        boolean[] b = new boolean[s.length()];
        for(int i = 0 ; i<s.length() ;i++){
            for(int j = 0 ;j<s.length() ;j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    b[i] = true;
                }
            }
        }
        for(int i = 0 ; i<b.length ;i++){
            if(b[i] == false){
                answer += "" + s.charAt(i) + " ";
            }
        }
        String store = "";
        String[] arrstr = answer.split(" ");
        // if(arrstr.length == 2){
        //     return arrstr[1];
        // }
        for(int i = 1 ;i<arrstr.length ;i++){
            for(int j = 0 ;j<i;j++){
                if(arrstr[i].charAt(0) < arrstr[j].charAt(0)){
                    store = arrstr[i];
                    arrstr[i] = arrstr[j];
                    arrstr[j] = store;
                }    
            }
        }
        answer = "";
        for(int i = 0 ; i<arrstr.length; i++){
            answer += arrstr[i];
        }
        return answer;
    }
}