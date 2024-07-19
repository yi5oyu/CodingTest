import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<String> prime = new ArrayList<>();
        for(int i = 2 ; i<3000 ;i++)
            prime.add(""+i);
        for(int i = 2 ; i*i<3000; i++)
            for(int j=i+i ; j<3000 ;j+=i)
                if(prime.contains(""+j))
                    prime.remove(""+j);
        
        List<Integer> num = new ArrayList<>();
        for(int i : nums)
            num.add(i);
        while(num.size() > 2){
            int a = num.remove(0);
            for(int i = 0; i<num.size() ;i++){
                int b = num.get(i);
                for(int j=i+1 ; j<num.size() ;j++){
                    if(prime.contains(""+(a+b+num.get(j))))
                        answer++;
                }
            }
        }
        return answer;
    }
}