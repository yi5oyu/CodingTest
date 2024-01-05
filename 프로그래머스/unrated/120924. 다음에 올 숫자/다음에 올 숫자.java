class Solution {
    public int solution(int[] common) {
        int answer = common[common.length-1];
        // int diff 
        //     = Math.abs(common[common.length-1] - common[common.length-2]); 
        // if(Math.abs(common[common.length-2]-common[common.length-3]) == diff){
        //     //등차
        // } else{
        //     //등비
        // }
        // //음의 정수
        
        // -1 -6 -11 -16 -21 -26 / 5 5 5 5
        int diff = common[1] - common[0];
        if(common[1] == common[0])
            diff=0;
        int div = 1;
        for(int i = 0 ; i<common.length ;i++){//0인 경우
            if(common[i] == 0)
                div = 0;
        }
        if(div != 0)
            div = common[1]/common[0];
        boolean judge = false;
        for(int i = 1 ;i<common.length-1 ;i++){
            if(diff == common[i+1] - common[i])
                judge = true;
        }
        int diffans = answer+diff;
        int divans = answer*div;
        answer = judge ? diffans : divans;

        // for(int i=common.length-1 ; i>0;i--){
            // if(diff == common[i-1] - common[i]){
            //     //등차
            //     answer+=diff;
            // }
            // if(div == common[i-1] - common[i]){
            //     answer*=diff;
            // }
                
//             if(common[i]>common[i-1]){ // 등차(공차+)
                
//             } else{ //공차-
                
//             }
        // }
        return answer;
    }
}