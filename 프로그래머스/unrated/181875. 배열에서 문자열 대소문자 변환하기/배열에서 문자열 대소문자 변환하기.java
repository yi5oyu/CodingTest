class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];//65A
        
        for(int i = 0 ;i<answer.length ;i++){
            answer[i] = "";
        }
        
        for(int i = 0 ;i<strArr.length ;i++){
            if(i%2 != 0){
                for(int j = 0 ; j<strArr[i].length() ;j++){
                    if((int)strArr[i].charAt(j) > 94){
                        answer[i] += ""+ (char)((int)strArr[i].charAt(j) -32);
                    } else
                        answer[i] += ""+ strArr[i].charAt(j);
                }
            } else {
                for(int j = 0 ; j<strArr[i].length() ;j++){
                    if((int)strArr[i].charAt(j) < 94){
                        answer[i] += ""+ (char)((int)strArr[i].charAt(j) +32);
                    } else
                        answer[i] += ""+ strArr[i].charAt(j);
                    
                }
            }
        }
        return answer;
    }
}