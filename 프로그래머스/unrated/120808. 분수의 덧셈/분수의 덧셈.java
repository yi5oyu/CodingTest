class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // denom = denom1 * denom2
        // numer11 = denom/denom1*numer1, numer22 = denom/denom2*numer2
        // numer = numer11+numer22. denom
        // numer,denom 크기 판별. 
        // 큰numer%denom작은 == 0
        // div = numer/denom
        // answer[0] = numer/div;
        // answer[1] = denom/div;
        int denom = denom1 * denom2;
        int numer11 = numer1*denom2;
        int numer22 = numer2*denom1;
        int numer = numer11 + numer22;
        answer[0]=numer;
        answer[1]=denom;
        int div = 1;
        if(denom>numer){
        for(int i = 2 ;i<denom;i++)
            if(numer % i == 0 && denom % i ==0)
                div = i;            
        } else if(denom < numer){
        for(int i = 2 ;i<numer;i++)
            if(numer % i == 0 && denom % i ==0)
                div = i;              
        } else{
            div = numer;
        }

        answer[0] /= div;
        answer[1] /= div;
        return answer;
    }
}