class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dices = {a, b,c ,d};
        int count = 0;
        int index = 0;
        int indexA = -1;
        int indexB = -1;
        for(int i = 0 ; i<dices.length ;i++){
            for(int j = i+1 ; j<dices.length;j++){
                if(dices[i] - dices[j] == 0){
                    index = i;
                    count++;
                }
            }
            if(count != 0)
                break;
            count = 0;
        }
        for(int i = 0 ;i<dices.length ;i++){
            if(i!=index && dices[index]!=dices[i]){
                if(indexA == -1){
                    indexA = i;
                } else
                    indexB = i;
            } 
        }
        int answer = 7;
        switch(count){
            case 0:
                for(int i = 0 ;i<dices.length ;i++)
                    if(answer > dices[i])
                        answer = dices[i];
                return answer;
            case 1:
                if(dices[indexA] == dices[indexB])
                    return (dices[index] + dices[indexA]) *
                            Math.abs(dices[index] - dices[indexA]);
                return dices[indexA] * dices[indexB];
            case 2:
                return (10*dices[index]+dices[indexA])*
                    (10*dices[index]+dices[indexA]);
            case 3:
                return 1111*a;
        }
        
        return indexA;
        
    }
}