class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        for(int i = 9 ; i >= 0 ; i--){
            if(i != 0 && X.contains(""+i) && Y.contains(""+i)){
                int lenX = X.length();
                int lenY = Y.length();
                X = X.replace(""+i, "");
                Y = Y.replace(""+i, "");
                int len = lenX - X.length() <= lenY - Y.length() ? lenX - X.length() : lenY - Y.length();
                answer += (""+i).repeat(len);
            } else if(answer.length() > 0 && X.contains(""+i) && Y.contains(""+i)){
                int lenX = X.length();
                int lenY = Y.length();
                X = X.replace(""+i, "");
                Y = Y.replace(""+i, "");
                int len = lenX - X.length() <= lenY - Y.length() ? lenX - X.length() : lenY - Y.length();
                answer += (""+i).repeat(len);
            }
        }
        answer += answer.isEmpty() ? X.contains("0") && Y.contains("0") ? "0" : "-1" : "";    
            
        return answer;
    }
}