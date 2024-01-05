class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int len = 1;
        for(int i = 0 ;i<my_string.length()-target.length()+1 ;i++){
            if((int)my_string.charAt(i) == (int)target.charAt(0)){
                for(int j = 1 ;j<target.length() ;j++){
                    if(my_string.charAt(i+j) == target.charAt(j)){
                        len++;
                    }
                }
                if(len == target.length()){
                    return 1;
                }
                len = 1;
            }
        }
        return answer;
    }
}