class Solution {
    public int solution(int n) {
        int answer = 0;
        int loop = 0;
        String str = "";
        while(loop < n){
            loop++;
            answer++;
            answer = loops(answer);
        }
        return answer;
    }
    public int loops(int answer){
        if(answer%3 == 0){
            answer = loops(++answer);
            return answer;
        }
        String str = ""+answer;
        for(int i = 0 ; i<str.length() ;i++){
            if(str.charAt(i) == '3'){
                answer = loops(++answer);
                break;
            }
        }
        return answer;
    }
}