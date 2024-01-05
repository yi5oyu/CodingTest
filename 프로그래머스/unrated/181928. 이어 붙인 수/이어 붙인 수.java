class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0 ; i<num_list.length ;i++){
            if(num_list[i]%2 == 0){
                even += "" + num_list[i];
            } else
                odd += "" + num_list[i];
        }
        
        int c = 1;
        for(int i = odd.length()-1 ; i>=0 ;i--){
            answer += ((int)odd.charAt(i) - 48) * c;
            c *= 10;
        }
        c = 1;
        for(int i = even.length()-1 ; i>=0 ;i--){
            answer += ((int)even.charAt(i) - 48) * c;
            c *= 10;
        }

        return answer ;
    }
}