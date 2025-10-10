import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int ck = 0;
        List<Integer> arrReserve = new ArrayList<>();
        List<Integer> arrLost = new ArrayList<>();
        Arrays.sort(reserve);
        Arrays.sort(lost);
        for(var num : reserve)
            arrReserve.add(num);
        for(var num : lost)
            arrLost.add(num);
        
        for(int i = 0 ; i < arrReserve.size() ; i++){
            for(int j = 0 ; j < arrLost.size() ; j++){
                if(arrReserve.get(i) == arrLost.get(j)){
                    arrReserve.remove(i--);
                    arrLost.remove(j--);
                    answer++;
                    break;
                }
            }
        }
        for(int i = 1; i <= n ; i++){
            if(i == arrLost.get(ck)){
                ck++;
                for(int j = 0 ; j < arrReserve.size() ; j++){
                    if(arrReserve.get(j) == i-1){
                        arrReserve.remove(j);
                        answer++;
                        break;
                    } else if(arrReserve.get(j) == i+1){
                        arrReserve.remove(j);
                        answer++;
                        break;
                    }
                }
            }
            if(ck >= arrLost.size())
                break;
        }
        return answer;
    }
}