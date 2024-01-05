class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        int j = 0;
        if(1<= strlist.length && strlist.length <= 100){
            for(String str : strlist){
                for(i = 0 ; i<str.length(); i++){
                }
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}