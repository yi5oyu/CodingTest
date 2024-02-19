class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] strArr = s.split(" ", -1);
        for(int j = 0 ; j<strArr.length ;j++){
            for(int i = 0 ; i<strArr[j].length() ;i++){
                if(i%2 == 0)
                    answer += (char)(strArr[j].charAt(i)-32);
                else
                    answer += strArr[j].charAt(i);
            }
            if(j != strArr.length-1)
                answer += " ";
        }
        return answer;
    }
}