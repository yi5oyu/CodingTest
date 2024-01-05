import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 2 ;i<=n ;i++){
            for(int j = 2 ;j<i ;j++){
                if(i%j == 0)
                    i++;
            }
            if(n%i == 0){
                n/=i;
                arrList.add(i);
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0 ;i<arrList.size() ;i++)
            answer[i] = arrList.get(i);
        
        return answer;
    }
}