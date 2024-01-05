class Solution {
    public int[] solution(int[] numbers, String direction) {
        // int[] answer = new int[numbers.length];
        int store = 0;
        
            if(direction.length() == 5){
                store = numbers[numbers.length-1];
                for(int i = numbers.length-1 ; 0<i;i--){
                    numbers[i] = numbers[i-1];
                }
                numbers[0] = store;
            } else{
                store = numbers[0];
                for(int i = 0 ; i<numbers.length-1;i++){
                    numbers[i] = numbers[i+1];
                }
                numbers[numbers.length-1] = store;
            }
        
        return numbers;
    }
}