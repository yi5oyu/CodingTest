class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] keyword = {"aya", "ye", "woo", "ma"};
        for(int i = 0 ; i < babbling.length ; i++){
            boolean repeat = false;
            String word = babbling[i];
            for(int j = 0 ; j < keyword.length ; j++){
                word = word.replace(keyword[j], ""+j);
                if(word.contains(""+j+""+j)){
                    repeat = true;
                    break;
                }   
            }
            for(int j = 0 ; j < keyword.length ; j++){
                word=word.replace(""+j, "");
            }
            if(word.isEmpty() && !repeat)
                answer++;
        }
        return answer;
    }
}