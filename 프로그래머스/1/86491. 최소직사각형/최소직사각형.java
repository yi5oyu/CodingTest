class Solution {
    public int solution(int[][] sizes) {
        int maxA = 0;
        int maxB = 0;
        int big = 0;
        int small = 0;
        for(int i = 0 ; i<sizes.length ;i++){
            if(sizes[i][0] > sizes[i][1]){
                big = sizes[i][0];
                small = sizes[i][1];
            } else{
                big = sizes[i][1];
                small = sizes[i][0];
            }
            if(big > maxA)
                maxA = big;
            if(small > maxB)
                maxB = small;
        }
        return maxA*maxB;
    }
}