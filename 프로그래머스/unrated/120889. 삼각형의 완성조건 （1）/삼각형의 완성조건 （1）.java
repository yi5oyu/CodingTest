class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int big = sides[0];
        int index = 0;
        int sum = 0;
        for(int z = 0 ; z<sides.length ;z++){
            if(1<= sides[z] && sides[z] <= 1000){
                for(int i = 0 ; i<sides.length; i++){
                    if(big < sides[i]){
                        big = sides[i];
                        index = i;
                    }
                }
            }
        }

        for(int i = 0 ; i<sides.length ;i++){
            if(i != index){
                sum += sides[i];
            }
        }
        
        if(sum > big){
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}