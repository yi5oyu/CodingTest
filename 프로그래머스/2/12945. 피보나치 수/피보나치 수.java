import java.math.*;

class Solution {
    public BigInteger solution(int n) {
        BigInteger answer = new BigInteger("0");
        BigInteger front = new BigInteger("0");
        BigInteger end = new BigInteger("1");
        BigInteger remainder = new BigInteger("1234567");
        for(int i = 1 ; i < n ; i++){
            answer = front.add(end);
            front = end;
            end = answer;
        }
        return answer.remainder(remainder);
    }
}