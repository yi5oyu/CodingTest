class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        boolean a = true;
        int j = 0;
        if(0 <= num1 && num1 < num2 && num2 < numbers.length){
            answer = new int[num2 - num1 + 1];
            if(2<= numbers.length && numbers.length <= 30){
                for(int arrnum : numbers ){
                    if(!(0<= arrnum && arrnum <= 1000)){
                        a = false;
                    }
                }
            }
        }
        if(a){
            for(int i = num1 ; i <= num2 ; i++ , j++){
                answer[j] = numbers[i];
            }
        }

        return answer;
    }
}