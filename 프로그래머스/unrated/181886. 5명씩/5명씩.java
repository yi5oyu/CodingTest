class Solution {
    public String[] solution(String[] names) {
        int len = 0;
        len = names.length/5;
        if(names.length%5 != 0){
            len++;
        }
        String[] answer = new String[len];
        for(int i = 0 ; i<answer.length ;i++){
            answer[i] = "";
        }
        int j = 0;
        for(int i = 0 ;i<names.length ;i++){
            if(i%5 == 0){
                answer[j] += names[i];
                j++;
            }
        }
        return answer;
    }
}