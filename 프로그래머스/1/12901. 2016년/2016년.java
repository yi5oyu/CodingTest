import java.util.*;

class Solution {
    public String solution(int a, int b) {
        List<Integer> days = new ArrayList<>(
            Arrays.asList(0,31,29,31,30,31,30,31,31,30,31,30));
        for(int i = 0 ; i<a ;i++)
            b += days.get(i);
        Map<Integer, String> answer =  new HashMap<>();
        answer.put(1,"FRI");
        answer.put(2,"SAT");
        answer.put(3,"SUN");
        answer.put(4,"MON");
        answer.put(5,"TUE");
        answer.put(6,"WED");
        answer.put(0,"THU");
        return answer.get(b%7);
    }
}