import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List<Integer> l = new ArrayList<>();
        l.add(arr[0]);
        int x = 1;
        while(x < arr.length){
            if(l.size() == 0)
                l.add(arr[x++]);
            else if(l.get(l.size()-1) == arr[x]){
                l.remove(l.size()-1);
                x++;
            } else if(l.get(l.size()-1) != arr[x])
                l.add(arr[x++]);
        }
        if(l.size()==0)
            l.add(-1);
        return l;
    }
}