import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        int[] words = new int[5];
        int[] aim = new int[5];
        for(int i = 0 ; i < word.length() ; i++){
            switch(word.charAt(i)){
                case 'A':
                    aim[i] = 1;
                    break;
                case 'E':
                    aim[i] = 2;
                    break;
                case 'I':
                    aim[i] = 3;
                    break;
                case 'O':
                    aim[i] = 4;
                    break;
                case 'U':
                    aim[i] = 5;
                    break;
            }
        }
        
        while(!Arrays.equals(aim, words)){
            answer++;
            if(words[0] == 0){
                words[0] = 1;
            } else if(words[1] == 0){
                words[1] = 1;
            } else if(words[2] == 0){
                words[2] = 1;
            } else if(words[3] == 0){
                words[3] = 1;   
            } else if(words[4] == 0){
                words[4] = 1;
            } else{
                words[4] += 1;
                if(words[4]%6 == 0){
                    words[4] = 0;
                    words[3] += 1;
                }
                if(words[3]%6 == 0){
                    words[3] = 0;
                    words[2] += 1;
                }
                if(words[2]%6 == 0){
                    words[2] = 0;
                    words[1] += 1;
                }
                if(words[1]%6 == 0){
                    words[1] = 0;
                    words[0] += 1;
                }
                if(words[0] == 6){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}