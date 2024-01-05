class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int max = 1000;
        boolean sign = true;
        int j = 0;
        if(1 <= num_list.length && num_list.length <= max){
            for(int i = 0 ; i < num_list.length; i++){
                if(!(0<= num_list[i] && num_list[i] <= max)){
                    sign = false;
                }
            }
        }
        for(int i = num_list.length - 1 ; 0 <= i; i--, j++){
            answer[j] = num_list[i];
        }
            
        return answer;
    }
}