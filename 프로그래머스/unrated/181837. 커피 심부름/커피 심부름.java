class Solution {
    public int solution(String[] order) {
        int answer = 0;
        // latte / americano,anything
        for(int i = 0 ;i<order.length ;i++){
            if(order[i].contains("latte")){
                answer += 5000;
            } else
                answer += 4500;
        }
        return answer;
    }
}