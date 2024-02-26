import java.util.*;

class Solution {
    static String a = "";
    public List solution(int t, int r) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 1 ; i<64 ;i++){
            a = "";
            l.add(Integer.parseInt(toBi(i)) * 5);
        }
        for(int i = 0 ; i<l.size() ; i++)
            if(l.get(i) >= t){
                t = i;
                break;
            }
                
        for(int i = l.size()-1 ; i>= 0 ;i--)
            if(l.get(i) <= r){
                r = i;
                break;
            } 
        if(r>=t){
            for(int i = t ; i<=r ;i++)
                answer.add(l.get(i));
        } else
            answer.add(-1);
        return answer;
    }
    public String toBi(int x){
        if (x < 2)
          return a += ""+x;
        toBi(x/2);
        return a += x%2;
    }
}