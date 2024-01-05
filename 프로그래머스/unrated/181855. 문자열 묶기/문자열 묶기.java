class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        for(int i = 1;i<=30 ;i++){
            for(int j = 0 ;j<strArr.length ;j++){
                if(i == strArr[j].length())
                    max++;
            }
            if(answer <= max){
                answer =max;
            }
            max =0;
        }
        return answer;
    }
}