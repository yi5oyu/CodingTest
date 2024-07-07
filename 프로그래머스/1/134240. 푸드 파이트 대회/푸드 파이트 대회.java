import java.util.*;

class Solution {
    static String answer = "";
    static int num = 1;
    static String back = "";
    public String solution(int[] food) {
        
        List<Integer> foods = new ArrayList<>();
        for(int i=1 ; i<food.length ;i++)
            div(share(food[i]));
        
        return answer += "0" + back;
    }
    
    int share(int food){
        if(food%2 != 0)
            food-=1;
        food/=2;
        return food;
    }
    
    void div(int food){
        for(int i = 0 ; i<food ;i++){
            answer += num;
            back = "" + num + back;
        }
        num++;
    }
    
}