class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0 ; i<my_string.length() ; i++){
            for(int j = 0 ; j<52 ;j++){
                if((int)my_string.charAt(i) == 65+j && 65+j < 91){
                    answer[j]++;
                } else if((int)my_string.charAt(i) == 97+j){
                    answer[26+j]++;
                }
            }
        }
        return answer;
    }
}