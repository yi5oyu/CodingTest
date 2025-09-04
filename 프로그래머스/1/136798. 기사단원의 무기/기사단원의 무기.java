class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] num = new int[100001];
        num[1]++;
        for(int i = 2 ; i <= number ; i++){
            num[i]++;
            for(int j = 1 ; j*i <= number ; j++){
                num[i*j]++;
            }
        }
        for(int i = 1 ; i <= number ; i++)
            answer += num[i]>limit ? power : num[i];
        
        return answer;
    }
}