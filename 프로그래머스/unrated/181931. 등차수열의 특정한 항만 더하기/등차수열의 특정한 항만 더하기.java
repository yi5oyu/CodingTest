class Solution {
    public int solution(int a, int d, boolean[] included) {
                int answer = 0;
        int[] intarr = new int[included.length];
        for(int i = 0 ; i<intarr.length;i++){
            intarr[i] = a+i*d;
        }
        for(int i = 0 ; i<intarr.length;i++){
            if(included[i] == true){
                answer += intarr[i];
            }
        }
        return answer;
    }
}