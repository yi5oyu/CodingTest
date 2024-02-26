import java.util.*;

class Solution {
    public List solution(int[] arr, int[] query) {
        List<Integer> l = new ArrayList<>();
        for(int x : arr)
            l.add(x);
        for(int i = 0 ; i<query.length ;i++){
            if(i%2 == 0){
                while(l.size() != query[i]+1)
                    l.remove(l.size()-1);
            } else{
                for(int j = 0 ; j<query[i] ;j++)
                    l.remove(0);
            }
        }
        return l;
    }
}