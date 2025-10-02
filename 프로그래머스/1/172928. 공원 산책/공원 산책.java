class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] point = new int[2];
        for(int i = 0 ; i < park.length ; i++){
            if(park[i].contains("S")){
                point[0] = i;
                point[1] = park[i].indexOf("S");
                break;
            }
        }
        for(String route : routes){
            int move = Integer.parseInt(route.substring(2,3));
            Boolean ck = true;
            switch(route.substring(0,1)){
                case "E":
                    if(point[1]+move < park[0].length()){
                        for(int i = point[1]+1 ; i <= point[1]+move ; i++){
                            if(park[point[0]].charAt(i) == 'X'){
                                ck = false;
                                break;
                            }
                        }
                        if(ck)
                            point[1] += move;
                    }
                    break;
                case "W":
                    if(point[1]-move >= 0){
                        for(int i = point[1]-1 ; i >= point[1]-move ; i--){
                            if(park[point[0]].charAt(i) == 'X'){
                                ck = false;
                                break;
                            }
                        }
                        if(ck)
                            point[1] -= move;
                    }
                    
                    break;
                case "S":
                    if(point[0]+move < park.length){
                        for(int i = point[0]+1 ; i <= point[0]+move ; i++){
                            if(park[i].charAt(point[1]) == 'X'){
                                ck = false;
                                break;                                
                            }
                        }
                        if(ck)
                            point[0] += move;
                    }
                    
                    break;
                case "N":
                    if(point[0]-move >= 0){
                        for(int i = point[0]-1 ; i >= point[0]-move ; i--){
                            if(park[i].charAt(point[1]) == 'X'){
                                ck = false;
                                break;
                            }
                        }
                        if(ck)
                            point[0] -= move;
                    }
                    break;
            }
        }
        return point;
    }
}