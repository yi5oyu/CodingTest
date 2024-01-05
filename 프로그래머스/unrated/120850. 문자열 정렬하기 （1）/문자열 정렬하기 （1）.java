class Solution {
    public int[] solution(String my_string) {
        int len = 0;
        for(int i = 0 ; i<my_string.length(); i++){
            if((int)my_string.charAt(i) < 65){
                len++;    
            }
        }
        int[] answer = new int[len];
        int store = 0;
        len = 0;
        for(int i = 0 ; i<my_string.length(); i++){
            if((int)my_string.charAt(i) < 65){
                answer[len] = (int)my_string.charAt(i)-48;
                len++;
            }
        }
        
        for(int i = 1;i<answer.length ;i++){
            for(int j = 0 ; j<=i ; j++){
                if(answer[i]<answer[j]){
                    store = answer[i];
                    answer[i] = answer[j];
                    answer[j] = store;
                }
            }
        }
        
        return answer;
    }
}