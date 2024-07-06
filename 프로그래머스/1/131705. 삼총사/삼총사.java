import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        List<Integer> box = new ArrayList<>();
        for(int i : number)
            box.add(i);
        
        while(box.size() > 2){
            int num = box.remove(0);
            int select = 0;
            for(int i = 0 ; i<box.size()-1 ;i++){
                int judge = num + box.get(i);
                for(int j = i+1 ; j<box.size() ;j++)
                    if(judge +  box.get(j) == 0)
                        answer++;
            }
        }

        return answer;

    }
}