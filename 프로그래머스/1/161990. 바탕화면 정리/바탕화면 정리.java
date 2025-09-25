class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        boolean[] start = {true, true, true};
        for(int i = 0 ; i < wallpaper.length ; i++){
            if(start[0] && wallpaper[i].contains("#")){
                start[0] = false;
                answer[0] = i;
                answer[2] = i+1;
                if(start[1]){
                    start[1] = false;
                    answer[1] = wallpaper[i].indexOf('#');
                } else if(answer[1] > wallpaper[i].indexOf('#')){
                    answer[1] = wallpaper[i].indexOf('#');
                }
                if(start[2]){
                    start[2] = false;
                    answer[3] = wallpaper[i].lastIndexOf('#');
                } else if(answer[3] < wallpaper[i].lastIndexOf('#')){
                    answer[3] = wallpaper[i].lastIndexOf('#');                    
                }
            } else if(wallpaper[i].contains("#")){
                answer[2] = i+1;
                if(start[1]){
                    start[1] = false;
                    answer[1] = wallpaper[i].indexOf('#');
                } else if(answer[1] > wallpaper[i].indexOf('#')){
                    answer[1] = wallpaper[i].indexOf('#');
                }
                if(start[2]){
                    start[2] = false;
                    answer[3] = wallpaper[i].lastIndexOf('#');
                } else if(answer[3] < wallpaper[i].lastIndexOf('#')){
                    answer[3] = wallpaper[i].lastIndexOf('#');                    
                }
            }
        }
        answer[3] += 1;
        return answer;
    }
}