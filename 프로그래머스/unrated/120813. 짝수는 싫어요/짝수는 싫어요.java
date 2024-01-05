class Solution {
    public int[] solution(int n) {
        int a = 0;
        int index = 0;
        if(n%2 != 0){
            a = 1;
        }
        int[] answer = new int[n/2 + a];
        for(int i = 1 ; i <= n; i++){
            if(i%2 != 0){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}