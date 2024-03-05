import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        Integer[] sums = new Integer[score.length];
        int[] answer = new int[sums.length];
        for(int i = 0 ; i<sums.length ;i++)
            sums[i] = score[i][0]+score[i][1];
        int grade = 1;
        for(int i = 200 ; i>=0 ; i--){
            int charge = 0;
            for(int j = 0 ; j<sums.length ;j++){
                if(sums[j] == i){
                    answer[j] = grade;
                    charge++;
                }
            }
            grade += charge;
        }
        return answer;
    }
}