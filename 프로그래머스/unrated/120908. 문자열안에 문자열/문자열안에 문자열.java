class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int count = 0;
        boolean sign = false;
        for(int i = 0 ; i<str1.length() - str2.length() + 1 ;i++){
            if(str1.charAt(i) == str2.charAt(0)){
                int index = i;
                count++;
                for(int j = 1 ; j< str2.length() ;j++){
                    if(str1.charAt(++index) == str2.charAt(j)){
                         count++;
                    }
                }
                if(count == str2.length()){
                    sign = true;
                }
                count = 0 ;
            }
        }
        if(sign){
            return answer = 1; 
        } else
            return answer = 2;
        
    }
}