class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int num = 0;
        int[] arr = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            String score = "";
            for(int j = num ; j < dartResult.length() ; j++){
                if(dartResult.charAt(j) > 64){
                    num=j;
                    break;
                }
                score += ""+(dartResult.charAt(j)-48);
            }
            String powStr = "";
            powStr = ""+dartResult.charAt(num++);
            int number = Integer.parseInt(score);
            number = powStr.equals("D") ? (int)Math.pow(number, 2) : powStr.equals("T") ? (int)Math.pow(number, 3) : number;
            char c = num <= dartResult.length()-1 ? dartResult.charAt(num) : 'a';
            
            if(c == '#'){
                arr[i] = -1*number;
                num++;
            } else if(c == '*'){
                if(i!=0){
                    arr[i-1] = arr[i-1]*2;
                    arr[i] = number*2;
                } else{
                    arr[i] = number*2;
                }
                num++;
            } else{
                arr[i] = number;
            }
        }
        answer = arr[0]+arr[1]+arr[2];
        return answer;
    }
}