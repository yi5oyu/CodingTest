import java.util.*;

class Solution {
    public List solution(int[] arr, int k) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i<arr.length ;i++){
            if(!l.contains(arr[i]))
                l.add(arr[i]);
            if(l.size() == k)
                break;
        }
        while(k != l.size())
            l.add(-1);
        return l;
    }
}