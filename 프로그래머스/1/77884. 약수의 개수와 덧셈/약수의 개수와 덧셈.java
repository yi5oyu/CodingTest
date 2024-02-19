class Solution {
    public int solution(int l, int r) {
        int answer = 0;
        for(int i = l ; i<=r ;i++){
            int num = 0;
            for(int j = 1 ; j<=i ;j++){
                if(i%j == 0)
                    num++;
            }
            if(num%2 == 0)
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }
}