class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len = 0;
        for(int i = 0 ; i<arr.length ;i++){
            for(int j = 0 ; j<delete_list.length ;j++){
                if(arr[i] == delete_list[j]){
                    len++;
                }
            }
        }
        int[] answer = new int[arr.length-len];
        boolean b = true;
        int z = 0;
        for(int i = 0 ;i<arr.length ;i++){
            for(int j = 0 ; j<delete_list.length ;j++){
                if(arr[i] == delete_list[j]){
                    b=false;
                }
            }
            if(b){
                answer[z] = arr[i];
                z++;
            }
            b= true;
        }
        return answer;
    }
}