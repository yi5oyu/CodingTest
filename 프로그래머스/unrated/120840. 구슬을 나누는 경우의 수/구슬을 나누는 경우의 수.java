import java.util.*;

class Solution {
    public int fac(int a, int b, int c){
        List<Integer> intList = new ArrayList();
        int d = a;
        for(int i = a ; i>b ; i--)
            intList.add(d--);
        int div = 1;
        boolean bb = false;
        for(int i = c ; i>1 ; i--){
            
            bb = false;
            for(int j = 0 ; j<intList.size() ;j++){
                if(intList.get(j)%i == 0){
                    intList.set(j,intList.get(j)/i);
                    bb = true;
                    break;
                }       
            }
            if(!bb)
                div*=i;
        }
        int m = 1;
        for(int i = 0 ; i<intList.size() ; i++)
            m*=intList.get(i);
        return m/div;
    }
    public int solution(int balls, int share) {
        if((balls-share) >= share)
            return fac(balls, balls-share, share);
        else
            return fac(balls, share, balls-share);
    }
    
    
    /*
    public Long fac(int a, int b){
        Long answer = 1L;
        for(int i = a ; i>b ; i--)
            answer*=i;
        return answer;
    }
    public Long fac(int a){
        Long answer = 1L;
        for(int i = 1 ; i<=a ; i++)
            answer*=i;
        return answer;
    }
    public Long solution(int balls, int share) {
        if((balls-share) >= share)
            return fac(balls, balls-share)/fac(share);
        else
            return fac(balls, share)/fac(balls-share);
    }
    */
}