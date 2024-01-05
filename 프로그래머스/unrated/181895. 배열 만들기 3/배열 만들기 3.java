import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // int a = intervals[0][1] - intervals[0][0] + 1;
        // int b = intervals[1][1] - intervals[1][0] + 1;
        // int len = a+b; 
        // int[] answer = new int[len];
        // int i = 0;
        // int z = 0;
        // for(int j = intervals[0][0] ; j<=a;j++){
        //             answer[z] = arr[j];
        //             z++;
        //             i++;
        // }
        // for(int j = intervals[1][0]; j<b;j++){
        //              answer[z] = arr[j];
        //              z++;
        //              i++;
        // }
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        for(int i = intervals[0][0] ;i<=intervals[0][1] ;i++){
            intlist.add(arr[i]);
        }
        for(int i = intervals[1][0] ;i<=intervals[1][1] ;i++){
            intlist.add(arr[i]);
        }
        int[] answer = new int[intlist.size()];
        for(int i = 0 ; i<answer.length;i++){
            answer[i] = intlist.get(i);
        }
        return answer;
    }
}