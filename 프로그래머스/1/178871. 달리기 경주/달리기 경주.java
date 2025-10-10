import java.util.*;

class Solution {
    public List solution(String[] players, String[] callings) {
        Map<Integer, String> raceNum = new HashMap<>();
        Map<String, Integer> racePlayer = new HashMap<>();
        for(int i = 0 ; i < players.length ; i++){
            raceNum.put(i+1, players[i]);
            racePlayer.put(players[i], i+1);
        }
        
        Integer num = null;
        Integer frontNum = null;
        String frontName = null;
        for(var calling : callings){
            num = racePlayer.get(calling);
            frontNum = num-1;
            frontName = raceNum.get(frontNum);
            raceNum.put(frontNum, calling);
            raceNum.put(num, frontName);
            racePlayer.put(calling, frontNum);
            racePlayer.put(frontName, num);
        }
        List<String> answer = new ArrayList<>();
        for(var name : raceNum.values())
            answer.add(name);
        return answer;
    }
}