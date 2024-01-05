import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> strArr = new ArrayList<String>();
        int l = 21;
        int r = 21;
        for(int i = 0 ; i<str_list.length ;i++){
            if(str_list[i].charAt(0) == 'l'){
                l = i;
                break;
            }
            if(str_list[i].charAt(0) == 'r'){
                r = i;
                break;
            }
        }
        if(l < r){
            for(int i = 0 ;i<l ;i++)
                strArr.add(str_list[i]);     
        } else{
            for(int i = r+1;i<str_list.length;i++)
                strArr.add(str_list[i]);
        }
        String[] answer = new String[strArr.size()];
        for(int i = 0 ;i<strArr.size() ;i++)
            answer[i] = strArr.get(i);
        return answer;
        /*
        ArrayList<String> strList = new ArrayList<String>();
        int index = 0;
        boolean b = true;
        for(int i = 0 ; i<str_list.length ;i++){
            if( 'l' == str_list[i].charAt(0)){
                index = i;
                break;
            }
            if( 'r' == str_list[i].charAt(0)){
                index = i;
                b = false;
                break;
            }
        }
        if(b){
            for(int i = 0 ; i<index ; i++)
                strList.add(str_list[i]);     
        } else
            for(int i = index + 1 ; i<str_list.length ; i++)
                strList.add(str_list[i]);
        }
        String[] answer = new String[strList.size()];
        for(int i = 0 ; i< answer.length ; i++){
            answer[i] = strList.get(i);
        }
        */

    }
}