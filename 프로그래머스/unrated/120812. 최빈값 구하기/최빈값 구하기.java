class Solution {
    public int solution(int[] array) {
        int max = 0;
        for(int i = 0 ;i<array.length ;i++){
            if(max < array[i])
                max = array[i];
        }
        int[] counter = new int[max+1];
        for(int i = 0; i<=max;i++){
            for(int j = 0 ;j<array.length;j++){
                if(i == array[j])
                    counter[i]++;
            }
        }
        max = 0;
        int index = 0;
        for(int i = 0 ;i<counter.length ;i++){
            if(max<counter[i]){
                max = counter[i];
                index = i;
            }
        }
        for(int i = 0;i<counter.length;i++){
            if(index != i && max == counter[i]){
                index = -1;
                break;
            }
        }
        return index;      
        
        // int answer = -2;
        // int store = 0;
        // for(int i = 0 ; i<array.length ;i++){
        //     for(int j = 0 ;j<array.length ;j++){
        //         if(i != j && array[i] == array[j]){
        //             store++;
        //         }
        //     }
        //     if(answer < store){
        //         answer = store+1;
        //     }
        //     store = 0;
        // }
        // return max;
    }
}