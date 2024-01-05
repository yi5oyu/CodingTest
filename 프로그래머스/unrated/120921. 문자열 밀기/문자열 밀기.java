class Solution {
    public int solution(String A, String B) {
        String answer = "";
        int len = A.length();
        int count = 0;
        if(A.equals(B))
            return count;
        for(int i = 0 ;i<len;i++){
            for(int j = 0 ;j<len ;j++){
                if(j==0){
                    answer += ""+A.charAt(len-1);
                } else
                    answer+= ""+A.charAt(j-1);
            }
            count++;
            if(answer.equals(B))
                return count;
            A = answer;
            answer = "";
        }
        return -1;
    }
}