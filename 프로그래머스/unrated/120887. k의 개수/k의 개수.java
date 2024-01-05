class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // ArrayList<String> strarrlist = new ArrayList<String>();
        String[] strarr = new String[j - i +1];
        for(int a = 0;a<strarr.length;a++){
            strarr[a] = "";
        }
        int a = 0;
        int b = 0;
        for(a = i,b = 0 ; a<=j ;a++, b++){
            strarr[b] += "" + a;
        }
        for(int c = 0 ;c<strarr.length ;c++){
            for(int d = 0 ; d<strarr[c].length() ; d++){
                if((int)strarr[c].charAt(d) -48 == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}