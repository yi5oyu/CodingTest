import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        for(int i = 0 ;i<array.length ;i++)
            array[i] -=n;
        Arrays.sort(array);
        int answer = -111;
        for(int i = 0 ;i<100 ;i++){
            for(int j = 0 ;j<array.length ;j++){
                if(Math.abs(array[j]) == i){
                    answer = array[j];
                    break;
                }
            }
            if(answer!=-111)
                break;
        }
        return answer+n;
    }
}