class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int hp = health;
        int attackCount = 0;
        int time = 0;
        int healDuration = 0;
        while(true){
            time++;
            healDuration++;
            if(attacks[attackCount][0] == time){
                hp -= attacks[attackCount][1];
                healDuration = 0;
                attackCount++;
            } else if(healDuration == bandage[0]){
                hp += bandage[1]+bandage[2];
                healDuration = 0;
            } else {
                hp += bandage[1];
            }
            if(hp > health)
                hp = health;
            if(hp <= 0){
                hp = -1;
                break;
            }
            if(attackCount >= attacks.length)
                break;
        }
        return hp;
    }
}