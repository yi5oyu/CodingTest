class Solution {
    public int solution(int n) {
        int answer = 0;
        int bit = 0;
        for(int i = 0 ; i <= 18 ; i++){
            if(((n >> i) & 1) == 1)
                bit++;
        }
        for(int i = n+1 ; i <= 1000000 ; i++){
            int bi = 0;
            for(int j = 0 ; j <= 18 ; j++){
                if(((i >> j) & 1) == 1)
                    bi++;
            }
            if(bit == bi){
                answer = i;
                break;
            }
        }

        return answer;
        
        // String bi = bi(n, "");
        // for(int i = n+1 ; i <= 1000000 ; i++){
        //     String str = bi(i, "");
        //     if(bi.replace("0", "").length() == str.replace("0", "").length()){
        //         answer = i;
        //         break;
        //     }
        // }        
    }
    
    // private String bi(int n, String str){
    //     for(int i = 1 ; i <= 1000000 ; i*=2){
    //         if(i >= n){
    //             for(int j = i ; j > 0 ; j/=2){
    //                 if(str.isEmpty()){
    //                     if(n/j == 1){
    //                         str += "1";
    //                         n -= j;
    //                     }
    //                 } else{
    //                     if(n/j == 1){
    //                         str += "1";
    //                         n -= j;
    //                     } else{
    //                         str += "0"; 
    //                     }
    //                 }
    //             }
    //             break;
    //         }
    //     }
    //     return str;
    // }
}