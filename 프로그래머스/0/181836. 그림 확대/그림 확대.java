class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int c = 0;
        for(int i = 0 ; i<picture.length ;i++){
            String str = "";
            for(int j = 0 ; j<picture[i].length() ;j++){
                for(int z = 0 ; z<k ;z++){
                    str += "" + picture[i].charAt(j);
                }
            }
            for(int j = 0 ; j<k ;j++)
               answer[c++] = str;
        }
        return answer;
    }
}