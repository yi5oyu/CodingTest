class Solution {
    public int[] solution(int n, int m) {
        int max = 0;
        int min = 0;
        if(n > m){
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        int a = 0;
        for(int i = min ; i>0 ;i--){
            if(max%i==0 && min%i==0){
                a = i;
                break;
            }
        }
        int b = 0;
        for(int i = max ; i<Integer.MAX_VALUE ; i++){
            if(i%max==0 && i%min==0){
                b = i;
                break;
            }
        }
        int[] answer = {a, b};
        return answer;
    }
}