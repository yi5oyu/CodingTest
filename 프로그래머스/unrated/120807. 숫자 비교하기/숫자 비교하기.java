class Solution {
    public int solution(int num1, int num2) {
        int min = 0;
        int max = 10000;
        int answer = 0;
        if(min <= num1 && num1 <= max && min <= num1 && num1 <= max ){
            if(num1 == num2){
                answer = 1;
            }else {
                answer = -1;
            }
        }
        return answer;
    }
}