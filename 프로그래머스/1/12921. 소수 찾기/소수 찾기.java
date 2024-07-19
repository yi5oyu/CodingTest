import java.util.*;

class Solution {
    static List prime = new ArrayList<>(Arrays.asList(2));
    public int solution(int n) {
        if(n > 2){
            prime.add(3);
            int i = 0;
            while(true){
                i++;
                if((6*i)-1 > n)
                    break;
                judge((6*i)-1);
                if((6*i)+1 > n)
                    break;
                judge((6*i)+1);
            }
        }

        return prime.size();
    }
    void judge(int n){
        for(int i = 5; i<=(int)Math.ceil(Math.sqrt(n)) ;i+=6)
            if(n%i == 0 || n%(i+2) == 0)
                return;
        prime.add(n);
    }
}