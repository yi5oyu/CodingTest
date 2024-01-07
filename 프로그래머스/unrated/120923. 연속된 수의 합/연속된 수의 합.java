class Solution {
    public int[] inputArr(int[] answer, int num, int total){
        for(int i = num-1 ; i>=0 ;i--)
            answer[i] = total--;
        return answer;
    }
    public int[] inputArr(int[] answer, int num, int total, boolean b){
        for(int i = 0 ; i<num ;i++)
            answer[i] = total++;
        return answer;
    }
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = total/num;
        
        if(num>total && total>0){
            return inputArr(answer, num, total);
        } else if(num%2 == 0){
            int e = total - n*(num-1);
            if(e > n)
                return inputArr(answer, num, e);
            else
                return inputArr(answer, num, e, true);
        } else{
            if(total == 0)
                return inputArr(answer, num, num/2);
            else
            return inputArr(answer, num, n-num/2, true);
        }
    }
}