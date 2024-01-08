class Solution {
    public int result(int a, int b){
        return (a-1) + a*(b-1);
    }
    public int solution(int M, int N) {
        if(M >= N)
            return result(N, M);
        else
            return result(M, N);
    }
}