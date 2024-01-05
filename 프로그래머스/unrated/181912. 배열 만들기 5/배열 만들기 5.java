import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        String str = "";
        for(int j = 0 ;j<intStrs.length ;j++){
            for(int i = s ;i<s+l ;i++){
                str += "" + intStrs[j].charAt(i);
            }
            int num =  Integer.parseInt(str);
            if(num>k)
                intList.add(num);
            str = "";
        }
        int[] answer = new int[intList.size()];
        for(int i = 0 ;i<answer.length ;i++){
            answer[i] = intList.get(i);
        }
        return answer;
    }
}