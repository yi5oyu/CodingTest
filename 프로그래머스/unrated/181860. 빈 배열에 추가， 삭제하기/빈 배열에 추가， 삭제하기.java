import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i = 0 ; i<arr.length ; i++){
            if(flag[i] == true){
                for(int j = 0;j<arr[i]*2;j++){
                    arrlist.add(arr[i]);
                }
            } else {
                for(int j = 0 ;j<arr[i] ;j++){
                    arrlist.remove(arrlist.size()-1);
                }
            }
        }
        int[] answer = new int[arrlist.size()];
        for(int i = 0 ; i<answer.length ;i++){
            answer[i] = arrlist.get(i);
        }
        return answer; // arr[i]의개수만큼 배열증가
    }
}