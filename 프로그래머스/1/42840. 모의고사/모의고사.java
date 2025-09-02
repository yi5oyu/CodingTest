import java.util.*;

class Solution {
    public List solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] arr = {0, 0, 0};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0 ; i < answers.length ; i++){
            if(a[i%5]==answers[i])
                arr[0]+=1;
            if(b[i%8]==answers[i])
                arr[1]+=1;
            if(c[i%10]==answers[i])
                arr[2]+=1;
        }
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==max)
               answer.add(i+1); 
        }
        return answer;
    }
    
    
    
}