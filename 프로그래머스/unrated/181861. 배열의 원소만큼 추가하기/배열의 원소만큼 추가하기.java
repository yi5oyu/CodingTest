class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i = 0 ;i<arr.length ;i++){
            len += arr[i];
        }
        int[] answer = new int[len];
        int a = 0;
        for(int i = 0 ; i<answer.length ;i++){
            for(int j = 0 ;j<arr[a] ;j++){
                answer[i] = arr[a];
                i++;
            }
            i--;
            a++;
        }
        return answer;
    }
}