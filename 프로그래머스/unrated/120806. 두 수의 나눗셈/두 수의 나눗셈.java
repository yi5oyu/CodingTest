class Solution {
    public int solution(int num1, int num2) {
        int min = 0;
        int max = 100;
        int answer = 0;
         double a = 0;
        if(min < num1 && num1 <= 100 && min < num2 && num2 <= 100 ){
            a = ((double)num1 / (double)num2) * 1000;
        }
        answer = (int)a;
        return answer;
    }
}