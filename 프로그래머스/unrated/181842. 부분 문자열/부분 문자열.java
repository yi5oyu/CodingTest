class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int len = 1;
        for(int i = 0 ; i<str2.length()-str1.length()+1;i++){
            if(str2.charAt(i) == str1.charAt(0)){
               len = 1;
               for(int j = 1 ;j<str1.length();j++){
                   if(str1.charAt(j) == str2.charAt(i+j)){
                        len++; 
                   }
               }
                if(len == str1.length()){
                    return 1;
                }
            }
            
        }
        return answer;
    }
}