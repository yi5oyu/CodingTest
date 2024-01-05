class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        if(my_string.length() > is_suffix.length()){
            int len = my_string.length() - is_suffix.length();
            if(my_string.charAt(len) == is_suffix.charAt(0)){
                for(int i = 1 ; i<is_suffix.length()-1 ; i++){
                    if(my_string.charAt(len + i) == is_suffix.charAt(i)){
                        answer++;
                    }
                }
                if(answer == is_suffix.length()-1){
                    return 1;
                }
            } else
                return 0;
        } else if(my_string.length() == is_suffix.length()){
            if(my_string.charAt(0) == is_suffix.charAt(0)){
                return 1;
                // 배열의 길이와 string의 첫글자는 같지만 뒤의 글자 다른 테스트 케이스 필요
            }           
        } else
            return 0;
        
        return 0;
    }
}