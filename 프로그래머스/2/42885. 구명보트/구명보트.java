import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        Arrays.sort(people);
        int index = people.length-1;
        for(int i = 0 ; i < people.length ; i++){
            int w = limit - people[i];
            boolean ck = true;
            for(int j = index ; j > i ; j--){
                if(w >= people[j]){
                    index = j-1;
                    answer--;
                    ck = false;
                    break;
                }
            }
            if(ck){
                break;
            }
        }
        return answer;
    }
}