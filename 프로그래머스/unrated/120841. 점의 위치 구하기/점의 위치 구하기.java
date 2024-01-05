class Solution {
    public int solution(int[] dot) {
        int answer;
        if (dot[0] > 0){
            if(dot[1] >0){
                return answer = 1;
            } else
                return answer = 4;
        } else {
            if(dot[1] >0){
                return answer = 2;
            } else
                return answer = 3;
        }
    }
}