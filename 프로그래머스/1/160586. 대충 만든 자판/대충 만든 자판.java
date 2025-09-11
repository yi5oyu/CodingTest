class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] arr = new int[26];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = 99;
        for(int i = 0 ; i < keymap.length ; i++){
            String key = keymap[i];
            for(int j = 0 ; j < 26 ; j++){
                for(int k = 0 ; k < key.length() ; k++){
                    if(j == key.charAt(k)-65){
                        if(arr[j] > k+1){
                            arr[j] = k+1;
                        }
                        break;
                    }
                }
            }
        }
        for(int i = 0 ; i < targets.length ; i++){
            for(int j = 0 ; j < targets[i].length() ; j++){
                answer[i] += arr[targets[i].charAt(j)-65];
                if(arr[targets[i].charAt(j)-65]==99){
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}