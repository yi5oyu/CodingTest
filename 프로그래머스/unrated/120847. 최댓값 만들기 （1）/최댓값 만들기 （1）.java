class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean b = true;
        int num1 = -1;
        int num2 = -1;
        int index = -1;
        if(2<= numbers.length && numbers.length <= 100){
            for(int a : numbers){
                if(!(0 <= a && a <= 10000)){
                    b = false;
                }
            }
        }
        if(b){
            for(int i = 0 ; i < numbers.length;i++){
                if(num1 < numbers[i]){
                    num1 = numbers[i];
                    index = i;
                }
            }
            for(int i=0 ;i<numbers.length;i++){
                if(i != index){
                   if(num2 < numbers[i]){
                       num2 = numbers[i];
                   } 
                }
            }
        }
        
        return answer = num1 * num2;
    }
}