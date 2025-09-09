class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int none = 0;
        for(int i = 0 ; i < win_nums.length ; i++){
            for(int j = 0 ; j < lottos.length ; j++){
                if(win_nums[i] == lottos[j]){
                    count++;
                    break;
                }
            }
        }
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0)
                none++;
        }
        answer[1] = count > 1 ? 7-count : 6;
        answer[0] = count+none > 1 ? 7-(count+none) : 6;
        return answer;
    }
}