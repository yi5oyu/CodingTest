class Solution {
    public int[] solution(int[] arr) {
        int indexA = 0;
        int indexB = 0;
        for(int i = 0 ;i<arr.length ; i++){
            if(arr[i] == 2){
                indexA=i;
                break;
            } else
                indexA = 99;
        }
        for(int i = arr.length-1 ;i>=0 ;i--){
            if(arr[i] ==2){
                indexB =i;
                break;
            } else
                indexB = 99;
        }
        int[] answer = new int[indexB - indexA + 1];
        int j = 0;
        int i = 0;
        if(indexA  == 99){
            answer[0] = -1;
            return answer;
        } else if(indexA == indexB){
            answer[0] = 2;
            return answer;
        } else {
            for(i = indexA, j = 0 ;i<=indexB ;i++,j++){
                answer[j] = arr[i];
            }
        }
        return answer;
    }
}