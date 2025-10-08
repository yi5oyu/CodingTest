class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int lastBoxes = n%w;
        int targetBox = num%w;
        int targetBoxRow = num/w;
        int lastBoxRow = n/w;
        if(targetBox == 0)
            targetBoxRow--;
        if(lastBoxes == 0){
            answer = lastBoxRow - targetBoxRow;
        } else{
            answer = lastBoxRow - targetBoxRow;
            if(lastBoxRow%2 != targetBoxRow%2){
                if(targetBox == 0){
                    answer++;
                } else if(w-lastBoxes < targetBox){
                    answer++;
                }
            } else{
                if(targetBox == 0){
                    answer += lastBoxes == 0 ? 1 : 0;
                } else if(targetBox <= lastBoxes){
                    answer++;
                }
            }
        }
        return answer;
    }
}