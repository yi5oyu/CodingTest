import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> str = new ArrayList<String>();
        for(int i = 0 ; i<strArr.length ;i++){
            if(!(strArr[i].contains("ad"))){
                str.add(strArr[i]);
            }            
        }
        String[] result = new String[str.size()];
        for(int i = 0 ; i<result.length ;i++){
            result[i] = str.get(i);
        }
        return result;
    }
}