class Solution {
    public int solution(int[][] dots) {
        int[] max = {-257, -257};
        int[] min = {257, 257};
        for(int i = 0 ; i<dots.length ; i++){
            for(int j = 0 ; j<dots[i].length ; j++){
                if(j==0){
                    if(max[0] < dots[i][j])
                        max[0] = dots[i][j];
                    if(min[0] > dots[i][j])
                        min[0] = dots[i][j];
                } else{
                    if(max[1] < dots[i][j])
                        max[1] = dots[i][j];
                    if(min[1] > dots[i][j])
                        min[1] = dots[i][j];
                }
            }
        }
        return (max[0]-min[0])*(max[1]-min[1]);
    }
}