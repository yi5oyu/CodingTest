class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0 ; i < schedules.length ; i++){
            int week = startday;
            boolean ck = true;
            for(int j = 0 ; j < timelogs[0].length ; j++){
                if(!(week%7 == 0 || week%7 == 6)  && timelogs[i][j] > ((schedules[i]/100+(schedules[i]%100+10)/60))*100+(schedules[i]%100+10)%60){
                    ck = false;
                    break;
                }
                week++;
            }
            if(ck)
                answer++;
        }
        return answer;
    }
}