class Solution {
    static int answer;
    public int solution(int[] arr) {
        int max = 0;
        for(int i = 0 ; i<arr.length ;i++){
            answer = 0;
            count(arr[i],-1);
            if(max <= answer)
                max = answer;
        }  
        return max;
    }
    public void count(int x, int y){
        if(x == y)
            return;
        y=x;
        if(x >= 50 && x%2 == 0){
            x/=2;
            answer++;
        } else if(50 > x && x%2 != 0){
            x*=2;
            x++;
            answer++;
        }
        count(x,y);
    }
}