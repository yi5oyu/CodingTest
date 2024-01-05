class Solution {
    public int solution(String my_string, String is_prefix) {
        if(is_prefix.length() > my_string.length()){
            return 0;
        }
        int len = 1;
        if(my_string.charAt(0) == is_prefix.charAt(0)){
            for(int i = 1 ; i<is_prefix.length() - 1 ;i++){
                if(my_string.charAt(i) == is_prefix.charAt(i)){
                    len++;
                }
            }
            if(len == is_prefix.length() -1){
                return 1;
            }
        } else{
            return 0;
        }
        return 0;
    }
}