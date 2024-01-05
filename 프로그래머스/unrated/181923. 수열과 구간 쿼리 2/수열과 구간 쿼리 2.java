class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = 1000001;
        for(int i = 0 ; i<queries.length;i++){
            for(int j = queries[i][0] ; j<=queries[i][1] ;j++){
                if(queries[i][2] < arr[j]){
                    if(min > arr[j]){
                        min = arr[j];
                    } 
                }
            }
            if(min == 1000001){
                min = -1;
            }
            answer[i] = min;
            min = 1000001;
        }
        return answer;
    }
}