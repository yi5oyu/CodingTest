class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0 ;i<my_string.length() ; i++){
            if(!((int)my_string.charAt(i) > 64)){
                answer += ((int)my_string.charAt(i) -48);
            }
        }
        return answer;
    }
}