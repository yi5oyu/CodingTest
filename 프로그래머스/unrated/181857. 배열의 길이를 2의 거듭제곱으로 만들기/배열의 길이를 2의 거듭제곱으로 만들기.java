class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i = 0, j=1 ;i<11 ;i++,j*=2){
            if(arr.length <=j){
                len = j;
                break;
            }
        }
        int[] answer = new int[len];
        for(int i = 0 ;i<arr.length ;i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}