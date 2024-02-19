class Solution {
    public String solution(String s) {
        String answer = "";
        int i = s.length()/2;
        if(s.length()%2 == 0)
            answer += "" + s.charAt(i-1) + "" + s.charAt(i);
        else
            answer += s.charAt(i);
        return answer;
    }
}