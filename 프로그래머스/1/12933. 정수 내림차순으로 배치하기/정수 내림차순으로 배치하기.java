import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0L;
        String str = "";
        List<Integer> l = new ArrayList<>();
        while(n>0){
            l.add((int)(n%10));
            n/=10;
        }
        Collections.sort(l);
        while(l.size()>0)
            str += ""+l.remove(l.size()-1);
        return answer = Long.parseLong(str);
    }
}