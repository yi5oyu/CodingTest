class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean[][] b = new boolean[db.length][2];
        for(int i = 0 ; i<db.length ;i++){
            b[i][0] = id_pw[0].equals(db[i][0]);
            b[i][1] = id_pw[1].equals(db[i][1]);
        }
        for(int i = 0;i<b.length;i++){
            if(b[i][1] == true && b[i][0] == true){
                return "login";    
            } else if(b[i][0] == true){
                return "wrong pw";
            }     
        }
    return "fail";
    }
}