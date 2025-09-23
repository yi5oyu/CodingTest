import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        for(int i = 0 ; i < moves.length ; i++){
            int num = 0;
            for(int j = 0 ; j < board.length ; j++){
                if(board[j][moves[i]-1] != 0){
                    num = board[j][moves[i]-1];
                    if(stack.isEmpty()){
                        stack.add(board[j][moves[i]-1]);
                    } else if(num == stack.get(stack.size()-1)){
                        answer++;
                        stack.remove(stack.size()-1);
                    } else{
                        stack.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }
        for(int i = 0 ; i < stack.size() ; i++){
            if(i+1 < stack.size() && stack.get(i)==stack.get(i+1)){
                answer++;
                stack.remove(i);
                stack.remove(i);
            }
        }
        return answer*2;
    }
}