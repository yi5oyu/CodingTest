class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int height = board.length-1;
        int width = board[0].length-1;
        if(0 < h && board[h-1][w].equals(color))
            answer++;
        if(width > w && board[h][w+1].equals(color))
            answer++;
        if(height > h && board[h+1][w].equals(color))
            answer++;
        if(0 < w && board[h][w-1].equals(color))
            answer++;
        return answer;
    }
}