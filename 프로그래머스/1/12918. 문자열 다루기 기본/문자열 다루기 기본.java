class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if(!(len == 4 || len == 6))
            return false;
        for(int i = 0 ; i<s.length() ;i++)
            if(s.charAt(i) > 60)
                return false;
        return answer;
    }
}