import java.util.*;

class Solution {
    public String solution(String s) {
        Integer[] arr = new Integer[s.split(" ").length];
        int num = 0;
        for(var str : s.split(" "))
            arr[num++] = Integer.valueOf(str);
        
        Arrays.sort(arr);
        
        return ""+arr[0]+" "+arr[arr.length-1];
    }
}