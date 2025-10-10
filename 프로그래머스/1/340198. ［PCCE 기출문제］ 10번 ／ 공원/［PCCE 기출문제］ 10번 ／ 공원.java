import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int[] point = {0, 0};
        Arrays.sort(mats);
        int w = 0;
        for(int i = 0 ; i < park.length ; i++){
            for(int j = 0 ; j < park[i].length ; j++){
                boolean ck = true;
                if(park[i][j].equals("-1") && i+mats[w] <= park.length && j+mats[w] <= park[i].length){
                    for(int k = i ; k < (i+mats[w]) ; k++){
                        for(int z = j ; z < (j+mats[w]) ; z++){
                            if(!park[k][z].equals("-1")){
                                ck = false;
                            }
                            if(!ck) break;
                        }
                        if(!ck) break;
                    }
                    if(ck){
                        j--;
                        answer = mats[w++];
                    }
                }
                if(w > mats.length-1) break;
            }
            if(w > mats.length-1) break;
        }
        return answer;
    }
}