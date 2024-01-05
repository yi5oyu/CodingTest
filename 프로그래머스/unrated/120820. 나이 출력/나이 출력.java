class Solution {
    public int solution(int age) {
        int answer = 2022;
        if(0 < age && age <= 120){
            for(int i = age ; i>1 ; i--){
                answer--;
            }
        }
        return answer;
    }
}