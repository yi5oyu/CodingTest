import java.util.*;

class Solution {
    public List solution(int N, int[] stages) {
        List<Integer> answer = new ArrayList<>();
        List<Double> arr = new ArrayList<>();
        Arrays.sort(stages);
        int div = stages.length;
        int num = 0;
        for(int i = 1 ; i<=N ; i++){
            int count = 0;
            for(int j = num ; j < stages.length ; j++){
                 if(stages[j] == i){
                     count++;
                 } else{
                     num=j;
                     break;
                 }
            }
            Double rate = 0.0;
            if(div != 0){
                rate = (1.0*count)/(1.0*div);    
            } else{
                rate = 0.0;
            }
            
            div -= count;
            if(arr.size()==0){
                arr.add(rate);
                answer.add(i);
            } else {
                for(int j = arr.size()-1 ; j >= 0 ; j--){
                    if(arr.get(j).equals(rate)){
                        arr.add(j+1, rate);
                        answer.add(j+1, i);
                        break;
                    } else if(arr.get(j) > rate){
                        arr.add(j+1, rate);
                        answer.add(j+1, i);
                        break;
                    }
                    if(j==0){
                        arr.add(0, rate);
                        answer.add(0, i);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}