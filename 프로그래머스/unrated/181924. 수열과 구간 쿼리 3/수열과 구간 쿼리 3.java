class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int store = 0;
        for(int i = 0 ; i<queries.length ;i++){
            store = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = store;
        }
        return arr;
    }
}