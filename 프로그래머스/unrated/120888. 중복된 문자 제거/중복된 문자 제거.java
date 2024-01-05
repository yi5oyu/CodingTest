class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arrchar = new char[my_string.length()];
        for(int i = 0 ; i<my_string.length() ; i++){
            arrchar[i] = my_string.charAt(i);
        }
        for(int i = 0 ;i<arrchar.length; i++){
            for(int j =0 ; j<arrchar.length ; j++){
                if(i != j && arrchar[i] == arrchar[j]){
                    arrchar[j] = '0';
                }
            }
        }
        int len = 0;
        for(int i = 0 ; i<arrchar.length;i++){
            if(arrchar[i] != '0'){
                answer += ""+arrchar[i];
            }
        }
        
        return answer;
    }
}