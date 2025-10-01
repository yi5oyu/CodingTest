class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int num = 0;
        boolean ck = false;
        for(int i = section[0] ; i <= n ; i++){
            if(i == section[num]){
                answer++;
                num++;
                if(num > section.length-1){
                    ck = true;
                    break;
                }
                while(i+m-1 >= section[num]){
                    if(i+m-1 == section[num] && n == section[num]){
                        ck = true;
                        break;
                    }
                    num++;
                    if(num > section.length-1){
                        ck = true;
                        break;
                    }
                }
            }
            if(ck)
                break;
        }
        return answer;
    }
}