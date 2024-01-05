class Solution {
    public int solution(int[] num_list) {
        int times = 1;
        int sum = 0;
        for(int i = 0 ; i<num_list.length;i++){
            times *= num_list[i];
            sum += num_list[i];
        }
        if(times < sum*sum){
            return 1;
        }else
            return 0;
    }
}