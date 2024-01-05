class Solution {
    public int[] solution(String myString) {
        int len = 1;
        for(int i = 0 ; i<myString.length();i++){
            if(myString.charAt(i) == 'x'){
                len++;
            }
        }
        String [] answer = myString.split("x");
        int [] result = new int[len];
        for(int i = 0 ; i<answer.length ;i++){
            result[i] = answer[i].length();
        }
        return result;
    }
}