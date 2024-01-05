class Solution {
    public String solution(String my_string, int[][] queries) {
        String comp = "";
        String answer = "";
        for(int i = 0 ;i<queries.length ;i++){
            for(int j = 0 ;j<my_string.length() ;j++){
                if(j<queries[i][0] || j>queries[i][1]){
                    answer += ""+my_string.charAt(j);
                    // return answer;
                } else {
                    if(comp.isEmpty()){
                        for(int k = queries[i][1] ;k>=queries[i][0] ;k--)
                            comp += ""+my_string.charAt(k);
                    answer += comp;
                    }
                }
            }
            comp ="";
            my_string = answer;
            answer = "";
        }
        return my_string;
            // for(int j = queries[i][0] ; j<=queries[i][1];j++){
            //     comp += ""+my_string.charAt(j);
            // }
            // for(int j = queries[i][1] ;j>=queries[i][0] ;j--){
            //     answer += ""+my_string.charAt(j);
            // }
    }
}