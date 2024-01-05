class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()/n;
        if(my_str.length()%n!=0)
            len++;
        String[] answer = new String[len];
        int count = 0;
        String str = "";
        for(int i = 0 ;i<my_str.length() ;i++){
            if(i != 0 && i%n == 0){
                answer[count++] = str;
                str = "";
            }
            str += ""+ my_str.charAt(i);
        }
        answer[count] = str;
        return answer;
    }
}