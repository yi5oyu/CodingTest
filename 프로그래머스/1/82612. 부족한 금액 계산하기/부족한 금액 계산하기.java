class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        for(long i = 1 ; i<=count ;i++)
            answer += price*i;
        if(answer - money > 0)
            return answer - money;
        else return 0;
    }
}