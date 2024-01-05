class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sumarr1 = 0;
        int sumarr2 = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        } else if(arr1.length < arr2.length){
            return -1;
        } else {
            for(int i = 0 ; i<arr1.length;i++){
                sumarr1 += arr1[i];
                sumarr2 += arr2[i];
            }
            if(sumarr1 > sumarr2){
                return 1;
            } else if(sumarr1 < sumarr2){
                return -1;
            } else
                return 0;
        }
    }
}