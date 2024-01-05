class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char ben = letter.charAt(0);
        int len = 0;
        int j = 0;
        
        if(1 <= my_string.length() && my_string.length() <= 100){
            for(int i = 0 ; i < my_string.length(); i++){
                if(ben != my_string.charAt(i)){
                    len++;
                }
            }
        }
        
        char[] arrchar = new char[len];
        for(int i = 0 ; i< my_string.length(); i++){
            if(ben != my_string.charAt(i)){
                arrchar[j] = my_string.charAt(i);
                j++;
            }
        }
    
        for(int i = 0 ; i< arrchar.length ; i++){
            answer += "" + arrchar[i];
        }

        return answer;
    }
}