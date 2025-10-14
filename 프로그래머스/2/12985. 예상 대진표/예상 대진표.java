class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        int num = 1;
        while(num < 20){
            int stage = n >> num++;
            if(a > stage && b > stage){
                a -= stage;
                b -= stage;
            }
            if(!((a <= stage && b <= stage) || (a > stage && b > stage))){
                while(((stage >> answer++) & 1) != 1);
                return answer;
            } else{
                if(stage < 1)
                    break;
            }
        }
        return 1;
    }
}