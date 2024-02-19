import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> l;
    static boolean[] b;
    public int solution(int n, int[][] computers) {
        l = new ArrayList<>();
        b = new boolean[n];
        int answer = 0;
        for(int i = 0 ; i<n ;i++){
            l.add(new ArrayList<>());
            for(int j = 0 ; j<n ;j++){
                if(computers[i][j] == 1 && i!=j)
                    l.get(i).add(j);
            }
        }
        for(int i = 0 ; i<n ;i++){
            if(!b[i]){
                answer++;
                loop(i);
            } 
        }
        return answer;
    }
    static void loop(int i){
        if(b[i])
            return;
        b[i] = true;
        for(int z = 0 ; z<l.get(i).size() ;z++)
            loop(l.get(i).get(z));
    }
}