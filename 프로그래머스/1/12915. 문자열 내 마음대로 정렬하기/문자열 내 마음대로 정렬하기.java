import java.util.*;

class Solution {
    public List solution(String[] strings, int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 97 ; i <= 122 ; i++){
            List<String> arr = new ArrayList<>();
            for(int j = 0 ; j < strings.length ; j++){
                if(strings[j].charAt(n) == i)
                    arr.add(strings[j]);
            }
            if(arr.size() > 1)
                Collections.sort(arr);
            for(int j = 0 ; j < arr.size() ; j++)
                answer.add(arr.get(j));
        }   
        return answer;
    }
}