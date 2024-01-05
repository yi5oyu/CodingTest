class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean b = true;
        for(int i =0;i<dic.length ;i++){
            for(int j = 0 ;j<spell.length ;j++){
                if(!dic[i].contains(spell[j]))
                    b=false;
            }
            if(b)
                return 1;
            b=true;
        }
        return 2;
    }
}