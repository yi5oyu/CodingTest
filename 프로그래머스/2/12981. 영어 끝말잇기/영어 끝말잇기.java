import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> word = new HashSet<>();
        String str = ""+words[0].charAt(0);
        for(int i = 0 ; i < words.length ; i++){
            if(word.contains(words[i]) || 
               str.charAt(str.length()-1) != words[i].charAt(0)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            word.add(words[i]);
            str = words[i];
        }
        return answer;
    }
}