class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = loop(target, 0, 0, numbers);
        return answer;
    }
    public int loop(int t, int index, int sum, int[] n){
        if(index == n.length)
            return sum == t ? 1 : 0;
        int s = 0;
        s += loop(t, index+1, sum + n[index%n.length], n);
        s += loop(t, index+1, sum - n[index%n.length], n);
        return s;
    }
}