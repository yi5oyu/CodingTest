class Solution {
    public String solution(String s) {
        String answer = "";
        s += "a";
        for(var str : s.split(" ")){
            boolean ck = true;
            for(var c : str.toCharArray()){
                if(ck){
                    ck = false;
                    answer += (c >= 97 && c <= 122) ? ""+(char)(c-32) : ""+c;
                } else{
                    answer += (c >= 65 && c <= 90) ? ""+(char)(c+32) : ""+c;                    
                }
            }
            answer += " ";
        }
        return answer.substring(0, answer.length()-2);
    }
}