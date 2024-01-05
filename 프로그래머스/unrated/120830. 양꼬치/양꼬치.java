class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int max = 1000;
        if(0 < n && n < max && n/10 <= k && k < max){
            answer += n * 12000;
            k -= n/10;
            answer += k * 2000;
        }
        return answer;
    }
}