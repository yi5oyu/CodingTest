class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.valueOf(strArr[0]);
        int max = 0;
        int min = 0;
        for(int i = 1 ; i<strArr.length ;i++){
            if(strArr[i].charAt(0) == '+'){
                max += Integer.valueOf(strArr[i+1]);
            } else if(strArr[i].charAt(0) == '-')
                min += Integer.valueOf(strArr[i+1]);            
        }
        
        return answer + max - min;
    }
}