class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = ""+order;
        for(int i = 0 ;i<strOrder.length() ;i++){
            if(strOrder.charAt(i) == '3' || strOrder.charAt(i) == '6'
                || strOrder.charAt(i) == '9'){
                answer++;
            }
        }
        return answer;
    }
}