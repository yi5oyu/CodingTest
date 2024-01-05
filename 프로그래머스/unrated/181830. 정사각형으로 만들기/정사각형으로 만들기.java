class Solution {
    public int[][] solution(int[][] arr) {
        int len = arr.length;
        for(int i = 0 ;i<arr.length ;i++){
            if(arr.length <arr[i].length)
                len = arr[i].length;
        }
        int[][] answer = new int[len][len];
        for(int i = 0 ;i<answer.length;i++){
            for(int j = 0;j<answer[0].length;j++){
                if(arr.length>i && arr[i].length>j){
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}