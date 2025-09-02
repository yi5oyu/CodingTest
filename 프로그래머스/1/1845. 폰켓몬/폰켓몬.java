import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int type = 0;
        for(int i = 1 ; i <= 200000 ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[j]==i){
                    type++;
                    break;
                }
            }
            if(type >= nums.length/2)
                break;
        }
        
        return type;
    }
}