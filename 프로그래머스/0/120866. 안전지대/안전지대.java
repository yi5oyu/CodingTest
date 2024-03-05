class Solution {
    public static int len;
    public static int[][] maps;
    public int solution(int[][] board) {
        len = board.length;
        maps = board;
        for(int i = 0 ; i<maps.length ;i++)
            for(int j = 0 ; j<maps.length ;j++)
                if(maps[i][j] == 1)
                    search(i,j);
        int answer = 0;
        for(int i = 0 ; i<maps.length ;i++){
            for(int j = 0 ; j<maps[i].length ;j++)
                if(maps[i][j]==0)
                    answer++;
        }
        return answer;
    }
    public void search(int x, int y){
        if(x < 0 || y < 0 || x>=len || y>=len || maps[x][y]==2)
            return;
        if(maps[x][y]==0)
            maps[x][y] = 2;
        else if(maps[x][y]==1){
            maps[x][y] = 3;
            search(x+1,y+1);
            search(x+1,y);
            search(x+1,y-1);
            search(x,y+1);
            search(x,y-1);
            search(x-1,y+1);
            search(x-1,y);
            search(x-1,y-1);
        }
        return;
    }
}