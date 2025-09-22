import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        List<Integer> arr = new ArrayList<>();
        for(int num : ingredient)
            arr.add(num);
        int answer = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i)==1 && i+4 <= arr.size()){
                if(arr.get(i+1)==2 && arr.get(i+2)==3 && arr.get(i+3)==1){
                    answer++;
                    for(int j = 0 ; j<4 ; j++)
                        arr.remove(i);
                    if(i > 4){
                        i -= 4;
                    } else{
                        i = -1;
                    }
                }
            }
        }
        return answer;
    }
}