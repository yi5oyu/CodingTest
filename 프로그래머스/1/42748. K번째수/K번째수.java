import java.util.*;

class Solution {
    public List solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0 ; i<commands.length ;i++){
            int count = 0;
            List<Integer> arr = new ArrayList<>();
            for(int j = commands[i][0]-1 ; j<commands[i][1] ;j++)
                arr.add(array[j]);
            for(int z = 1 ; z<101 ;z++){
                if(arr.contains(z))
                    count += Collections.frequency(arr, z);
                if(commands[i][2] <= count){
                    answer.add(z);
                    break;
                }
            }
        }
        return answer;
    }
}