class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int a = 1;
        int x = 0;
        int y = 0;
        while(a < (n*n)+1){
            while(x>=0 && y>=0 && x<n && y<n && answer[x][y] == 0)
                answer[x][y++] = a++;
            y--; x++;
            while(x>=0 && y>=0 && x<n && y<n && answer[x][y] == 0)
                answer[x++][y] = a++;
            x--; y--;
            while(x>=0 && y>=0 && x<n && y<n && answer[x][y] == 0)
                answer[x][y--] = a++;
            y++; x--;
            while(x>=0 && y>=0 && x<n && y<n && answer[x][y] == 0)
                answer[x--][y] = a++;
            x++; y++;
        }
        return answer;
    }
}