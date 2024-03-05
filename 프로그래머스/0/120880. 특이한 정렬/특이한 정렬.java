import java.util.*;

class Solution {
    public List solution(int[] numlist, int n) {
        List<Integer> lt = new ArrayList<>();
        List<Integer> gt = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i<numlist.length ;i++){
            if(numlist[i] == n)
                answer.add(n);
            else if(numlist[i] < n)
                lt.add(numlist[i]);
            else
                gt.add(numlist[i]);
        }
        Collections.sort(gt);
        Collections.sort(lt, Collections.reverseOrder());
        while(answer.size() < numlist.length){
            if(lt.size() > 0 && gt.size() > 0){
                if(Math.abs(lt.get(0) - n) < Math.abs(gt.get(0) - n))
                    answer.add(lt.remove(0));
                else
                    answer.add(gt.remove(0));
            } else if(lt.size() > 0)
                for(int i = 0 ; i<lt.size() ;i++)
                    answer.add(lt.remove(0));
            else
                for(int i = 0 ; i<gt.size() ;i++)
                    answer.add(gt.remove(0));
        }
        return answer;
    }
}