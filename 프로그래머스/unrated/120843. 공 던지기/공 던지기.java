class Solution {
    public int pic(int[] numbers, int a){
        if(a==0){
            return numbers[numbers.length-2];
        } else
            return numbers[(a-1)*2];
    }
    public int picodd(int[] numbers, int a, int b){
        if(a==0){
            return numbers[numbers.length-2];
        }else{
            if(a>b)
                return numbers[(a-b-1)*2+1];
            else
                return numbers[(a-1)*2];
        }
    }
    public int solution(int[] numbers, int k) {
        int a = 0;
        if(numbers.length%2 == 0){
            if(k >= (numbers.length/2))
                return pic(numbers, k%(numbers.length/2));
            else
                return pic(numbers, k-1);
        } else 
            return picodd(numbers, k%numbers.length, (numbers.length/2)+1);
        
    }
}