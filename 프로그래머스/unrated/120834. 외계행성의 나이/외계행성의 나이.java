class Solution {
    public String solution(int age) {
        String answer = "";
        //97 a // 100일때 10나옴
        int one = age / 1000;
        int two = (age%1000) / 100;
        int thr = (age%100) / 10;
        int fou = age % 10;
        

        
        if(one != 0){
            answer += ""+ (char)(one+97);
            answer += ""+ (char)(two+97);
            answer += ""+ (char)(thr+97);
        } else if(two != 0){
            answer += ""+ (char)(two+97);
            answer += ""+ (char)(thr+97);
        } else if(thr != 0){
            answer += ""+ (char)(thr+97);
        }
        answer += ""+(char)(fou+97);
        
        return answer;
    }
}