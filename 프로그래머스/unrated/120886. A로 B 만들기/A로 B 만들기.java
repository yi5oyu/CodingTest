class Solution {
    public int solution(String before, String after) {
        for(int i = 0 ;i<before.length() ;i++)
            after = after.replaceFirst(""+before.charAt(i),""); 
        if(after.isEmpty())
            return 1;
        else
            return 0;
    }
}