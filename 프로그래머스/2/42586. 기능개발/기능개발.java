import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        int sum = 0;
        int time = 0;
        while(count < progresses.length){
            int num = progresses[count] + (speeds[count] * time++);
            if(num >= 100){
                sum++;
                count++;
                time--;
            } else {
                if(sum > 0)
                    answer.add(sum);
                sum = 0;
            }
        }
        answer.add(sum);
        return answer;
    }
}