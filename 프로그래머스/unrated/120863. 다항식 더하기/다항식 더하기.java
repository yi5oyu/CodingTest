class Solution {
    public String solution(String polynomial) {
        String[] strarr = polynomial.split(" ");
        String answer = "";
        int n = 0;
        int x = 0;
        for(int i = 0 ; i<strarr.length; i++){
            if(strarr[i].charAt(0) != '+'){
                if(strarr[i].contains("x")){
                    if(strarr[i].length() != 1){
                        x += Integer.valueOf(strarr[i].substring(0,strarr[i].length()-1));   
                    } else
                        x++;
                } else
                    n += Integer.valueOf(strarr[i]);
            }
        }
        if(x != 0 && n != 0){
            if(x == 1){
                return answer = "" +"x + "+n;
            }
            return answer = "" + x+"x + "+n;
        } else if(x == 0){
            return answer = "" + n;
        } else if(n==0){
            if(x == 1){
                return answer = "x";
            }
            return answer = "" + x+"x";
        } else
            return answer = "";
            
    }
}