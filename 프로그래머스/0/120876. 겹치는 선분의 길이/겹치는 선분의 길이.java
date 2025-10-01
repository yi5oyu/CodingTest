import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<String, Boolean> map = new HashMap<>();
        for(int[] line : lines){
            for(int i = line[0]+1 ; i<=line[1] ; i++){
                String str = ""+(i-1)+""+i;
                if(map.containsKey(str) && map.get(str)){
                    answer++;
                    map.put(str, false);
                } else if(!map.containsKey(str)){
                    map.put(str, true);
                }
            }
        }
        
        return answer;
    }
}