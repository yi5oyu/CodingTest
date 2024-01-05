class Solution {
    public int solution(int n) {
        int answer = 0;
        // if(n%2 == 0){
        //     for(int i = 0 ; i<=n ; i++){
        //     if(i%2 == 0){
        //             answer += i*i;
        //         }
        //     }
        // } else {
        //     for(int i = 0 ; i<=n ;i++){
        //     if(i%2 != 0) {
        //             answer+= i;
        //         }
        //     }
        // }
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i<=n ; i++){
            if(i%2 == 0){
                even += i*i;
            } else
                odd += i;
        }
        if(n%2 == 0){
            return even;
        } else
            return odd;
    }
}