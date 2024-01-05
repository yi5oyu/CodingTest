class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = "";
        for(int i = 0 ; i<array.length ;i++){
            a += ""+array[i];
        }
        String[] b = a.split("");
        for(int i = 0 ; i<b.length ; i++){
            if(b[i].charAt(0) == '7'){
                answer++;
            }
        }
        return answer;
    }
}