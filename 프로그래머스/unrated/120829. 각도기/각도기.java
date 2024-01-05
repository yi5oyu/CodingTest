class Solution {
    public int solution(int angle) {
        int answer = 0;
        int min = 0;
        int max = 180;
        if(min < angle && angle <= 180){
          if(0 < angle && angle < 90){
            answer = 1;
        } else if(angle == 90){
            answer = 2;
        } else if(angle < 180){
            answer = 3;
        } else{
            answer = 4;
        }      
        }

        return answer;
    }
}