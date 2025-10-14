import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> element = new HashSet<>();
        for(int i = 0 ; i < elements.length ; i++){
            int num = 0;
            for(int j = i ; j < elements.length+i ; j++){
                num += elements[j%elements.length];
                element.add(num);
            }
        }
        return element.size();
    }
}