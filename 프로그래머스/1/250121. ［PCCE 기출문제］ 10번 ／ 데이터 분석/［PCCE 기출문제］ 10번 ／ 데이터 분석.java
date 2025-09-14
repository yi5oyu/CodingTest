import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int num = ext.equals("code") ? 0 : ext.equals("date") ? 1 : ext.equals("maximum") ? 2 : 3;
        int sort = sort_by.equals("code") ? 0 : sort_by.equals("date") ? 1 : sort_by.equals("maximum") ? 2 : 3;
        TreeMap<Integer, int[]> table = new TreeMap<>();
        for(int i = 0 ; i < data.length ; i++){
            if(data[i][num] < val_ext){
                table.put(data[i][sort], data[i]); 
            }
                
        }
        int[][] answer = table.values().toArray(new int[0][]);

        return answer;
    }
}