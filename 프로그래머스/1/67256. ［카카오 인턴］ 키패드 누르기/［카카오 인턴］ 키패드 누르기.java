import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String alpha = hand.equals("left") ? "L" : "R";
        String beta = alpha.equals("L") ? "R" : "L";
        Map<String, Integer> hands = new HashMap<>();
        hands.put("L", -1);
        hands.put("R", -1);
        Set<Integer> zero;
        Set<Integer> one;
        Set<Integer> two;
        Set<Integer> thr;
        Set<Integer> fou;
        Integer main = hands.get(alpha);
        Integer side = hands.get(beta);
        for(int i = 0 ; i < numbers.length ; i++){
            switch(numbers[i]){
                case 1,4,7:
                    answer += "L";
                    hands.put("L", numbers[i]);
                    break;
                case 3,6,9:
                    answer += "R";
                    hands.put("R", numbers[i]);
                    break;
                case 0:
                    main = hands.get(alpha);
                    side = hands.get(beta);
                    zero = new HashSet<>(Arrays.asList(0));
                    one = new HashSet<>(Arrays.asList(-1, 8));
                    two = new HashSet<>(Arrays.asList(7, 5, 9));
                    thr = new HashSet<>(Arrays.asList(2, 4, 6));
                    fou = new HashSet<>(Arrays.asList(1, 3));
                    answer += ck(hands, 0, alpha, beta, main, side, zero, one, two, thr, fou);
                    break;
                case 2:
                    main = hands.get(alpha);
                    side = hands.get(beta);
                    zero = new HashSet<>(Arrays.asList(2));
                    one = new HashSet<>(Arrays.asList(1, 3, 5));
                    two = new HashSet<>(Arrays.asList(4, 6, 8));
                    thr = new HashSet<>(Arrays.asList(0, 7, 9));
                    fou = new HashSet<>(Arrays.asList(-1));
                    answer += ck(hands, 2, alpha, beta, main, side, zero, one, two, thr, fou);
                    break;
                case 5:                    
                    main = hands.get(alpha);
                    side = hands.get(beta);
                    zero = new HashSet<>(Arrays.asList(5));
                    one = new HashSet<>(Arrays.asList(2, 4, 6, 8));
                    two = new HashSet<>(Arrays.asList(0, 1, 3, 7, 9));
                    thr = new HashSet<>(Arrays.asList(-1));
                    fou = new HashSet<>(Arrays.asList(-2));
                    answer += ck(hands, 5, alpha, beta, main, side, zero, one, two, thr, fou);
                    break;                
                case 8:                    
                    main = hands.get(alpha);
                    side = hands.get(beta);
                    zero = new HashSet<>(Arrays.asList(8));
                    one = new HashSet<>(Arrays.asList(0, 5, 7, 9));
                    two = new HashSet<>(Arrays.asList(2, 4, 6, -1));
                    thr = new HashSet<>(Arrays.asList(1, 3));
                    fou = new HashSet<>(Arrays.asList(-2));
                    answer += ck(hands, 8, alpha, beta, main, side, zero, one, two, thr, fou);
                    break;
            }
        }
        return answer;
    }
    
    public String ck(Map hands, Integer num, String alpha, String beta, Integer main, Integer side, Set zero, Set one, Set two, Set thr, Set fou){
        if(zero.contains(main)){
            hands.put(alpha, num);
            return alpha;
        } else if(zero.contains(side)){
            hands.put(beta, num);
            return beta;
        } else if(one.contains(main)){
            hands.put(alpha, num);
            return alpha;
        } else if(one.contains(side)){
            hands.put(beta, num);
            return beta;
        } else if(two.contains(main)){
            hands.put(alpha, num);
            return alpha;
        } else if(two.contains(side)){
            hands.put(beta, num);
            return beta;
        } else if(thr.contains(main)){
            hands.put(alpha, num);
            return alpha;
        } else if(thr.contains(side)){
            hands.put(beta, num);
            return beta;
        } else if(fou.contains(main)){
            hands.put(alpha, num);
            return alpha;
        } else if(fou.contains(side)){
            hands.put(beta, num);
            return beta;
        }
        return "";
    }
}