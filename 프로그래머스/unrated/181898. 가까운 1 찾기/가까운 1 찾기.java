class Solution {
    public int solution(int[] arr, int idx) {
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[idx] == 1){
                return idx;
            } else if(idx < i){
                if(arr[i] == 1){
                    return i;
                } 
            } 
        }
        return -1;
    }
}