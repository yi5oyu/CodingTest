class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int swap = -1001;
        for(int i = 1 ; i<array.length ;i++){
            for(int j = 0 ; j<i ;j++){
                if(array[j] < array[i]){
                    swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                    swap = -1001;
                }
            }
        }
        answer = array[(array.length / 2)]; 
        return answer;
    }
}