class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String store = ""+ num;
        for(int i = 0 ;i<store.length() ;i++){
            if((int)store.charAt(i)-48 == k){
                return answer = i+1;
            }
        }
        return answer;
    }
}