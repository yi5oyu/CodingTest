class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int min1 = -10000;
        int min2 = -10000;
        int count = 0;
        for(int i = 0; i<numbers.length ;i++){
            if(numbers[i]>=0){
                if(numbers[i] > max1){
                    max1 = numbers[i]; 
                } else if(numbers[i]> max2){
                    max2 = numbers[i];
                } 
            } else{
                count++;
                if(numbers[i] > min1){
                    min1 = numbers[i];
                } else if(numbers[i]> min2){
                    min2 = numbers[i];
                } 
            }
        }
        if(numbers.length == 2){
            return answer = numbers[0] * numbers[1];
        } else{
          if(count >1){
            if(max1*max2 > min1*min2){
                return answer = max1*max2;
            } else
                return answer = min1*min2;
        } else{
            return answer = max1*max2;
        }
        }

        
    }
}