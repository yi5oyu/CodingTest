class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        boolean [] b = new boolean[my_string.length()];
        for(int i = 0 ; i<my_string.length() ;i++){
            for(int j = 0 ; j<indices.length ;j++){
                if(i == indices[j]){
                    b[i] = true;
                    break;
                }
            }
        }
        for(int i = 0 ; i<b.length ;i++){
            if(b[i] == false){
                answer += "" + my_string.charAt(i);
            }
        }
        return answer;
    }
}