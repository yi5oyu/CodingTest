class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")){
            int len = s.length();
            s = s.replaceAll("0", "");
            int num = s.length();
            answer[1] += len - num;
            answer[0] += 1;
            int i = 1;
            while(true){
                if(i >= num)
                    break;
                i*=2;
            }
            String str = "";
            for(int j = i ; j >= 1 ; j/=2){
                if(str.isEmpty()){
                    if(num/j == 1){
                        num -= j;
                        str += "1";
                    }
                } else{
                    if(num/j == 1){
                        num -= j;
                        str += "1";
                    } else{
                        str += "0";
                    }                    
                }
            }
            s = str;
        }
        return answer;
    }
}