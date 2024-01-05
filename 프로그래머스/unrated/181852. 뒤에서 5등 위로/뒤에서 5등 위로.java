class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        
        int store = 0;
        for(int i = 1; i<num_list.length ;i++){
            for(int j = 0 ;j<i ;j++){
                if(num_list[j] > num_list[i]){
                    store=num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = store;
                }
            }
        }
        for(int i = 0 ; i<answer.length ;i++){
            answer[i] = num_list[i+5];
        }
        return answer;
    }
}