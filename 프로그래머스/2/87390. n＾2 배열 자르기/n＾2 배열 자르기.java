class Solution {
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int)(right-left)+1];
        for(long i = left ; i <= right ; i++){
            long div = i/n;
            long rem = i%n;
            answer[(int)(i-left)] = div > rem ? div+1L : rem+1L;
        }
        return answer;
    }
}