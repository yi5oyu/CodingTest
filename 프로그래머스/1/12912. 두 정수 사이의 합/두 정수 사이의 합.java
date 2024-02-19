class Solution {
    public long solution(int a, int b) {
        if(a>b)
            return sum(a,b);
        else
            return sum(b,a);
    }
    public long sum(int a, int b){
        long ans = 0L;
        for(long i = b ; i<=a ; i++)
            ans += i;
        return ans;
    }
}