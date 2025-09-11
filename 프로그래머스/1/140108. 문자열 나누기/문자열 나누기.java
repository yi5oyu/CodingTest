class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = 0;
        char x = s.charAt(len);
        int aa = 1;
        int bb = 0;
        while(len < s.length()-1){
            if(aa == bb){
                len++;
                answer++;
                if(len == s.length()-1){
                    answer++;
                    break;
                }
                    
                x = s.charAt(len);
                aa = 1;
                bb = 0;
            }
            char xx = s.charAt(++len);
            if(x == xx){
                aa++;
            } else{
                bb++;
            }
            if(len == s.length()-1){
                answer++;
                break;
            }
        }
        if(s.length()==1)
            answer++;
        return answer;
    }
}