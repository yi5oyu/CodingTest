import java.util.*;

class Solution {
    public List solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < photo.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < name.length ; j++){
                for(int k = 0 ; k < photo[i].length ; k++){
                    if(name[j].equals(photo[i][k]))
                        sum+=yearning[j];
                }
            }
            result.add(sum);
        }
            
        return result;
    }
}