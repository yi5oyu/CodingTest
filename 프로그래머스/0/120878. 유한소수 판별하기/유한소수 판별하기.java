import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i = 1000 ; i>1 ;i--){
            if(a%i == 0 && b%i == 0){
                a/=i;
                b/=i;
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 2 ; i<=b ;i++){
            if(b%i == 0){
                l.add(i);
                b/=i;
                i--;
            }
        }
        for(int i = 0 ; i<l.size() ; i++){
            if( !(l.get(i) == 2 || l.get(i) == 5) )
                answer = 2;
        }
        return answer;
    }
}