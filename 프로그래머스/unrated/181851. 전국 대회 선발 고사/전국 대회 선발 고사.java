import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        // Arrays.sort(rank);
        for(int i = 0 ; i<attendance.length;i++)
            if(attendance[i] != true)
                rank[i] = 101;
        int count = 0;
        for(int i = 1 ;i<=rank.length ;i++){
            for(int j = 0 ;j<rank.length;j++){
                if(rank[j] == i){
                    switch(count){
                        case 0:
                            answer += 10000*j;
                            break;
                        case 1:
                            answer += 100*j;
                            break;
                        case 2:
                            answer += j;
                            break;
                    }
                    count++;
                }
            }
        }
        
        return answer;
    }
}