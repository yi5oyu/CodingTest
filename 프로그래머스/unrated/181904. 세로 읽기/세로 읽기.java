class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] chararr = new char[my_string.length()/m][m];
        for(int i = 0 ;i<my_string.length() ;i++){
            chararr[i/m][i%m] = my_string.charAt(i);
        }
        for(int i= 0 ;i<chararr.length ;i++){
            answer += "" + chararr[i][c-1];
        }
        return answer;
    }
}