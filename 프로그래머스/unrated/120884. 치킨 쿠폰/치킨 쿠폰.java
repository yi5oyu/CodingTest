class Solution {
    public int solution(int chicken) {
        int count = 0;
        while(chicken > 9){
            count += chicken/10;
            chicken = chicken/10 + chicken%10;
        }
        return count;
    }
}