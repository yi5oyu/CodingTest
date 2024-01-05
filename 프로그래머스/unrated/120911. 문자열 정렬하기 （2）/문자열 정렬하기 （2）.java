class Solution {
    public String solution(String my_string) {
        String answer = "";
        //65 97
        for(int i = 0 ; i<my_string.length() ; i++){
            if((int)my_string.charAt(i) < 96){
                answer += "" + (char)((int)my_string.charAt(i) + 32);
            } else{
                answer += "" + my_string.charAt(i);
            }
            
        }
        char[] arrchar = new char[answer.length()];
        
        for(int i = 0 ; i< arrchar.length;i++){
            arrchar[i] = answer.charAt(i);
        }
        answer = "";
        char store = '0';
        for(int i = 1; i<arrchar.length;i++){
            for(int j = 0 ; j<i;j++){
                if((int)arrchar[i] < arrchar[j]){
                    store = arrchar[i];
                    arrchar[i] = arrchar[j];
                    arrchar[j] = store;
                }
            }
        }
        for(int i = 0 ; i<arrchar.length;i++){
            answer += ""+arrchar[i];
        }
        return answer;
    }
}