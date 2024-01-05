class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int lv0 = a+b+c;
        int lv1 = lv0*(a*a+b*b+c*c);
        int lv2 = lv1*(a*a*a+b*b*b+c*c*c);
        
        if(a == b && b == c){
            return lv2;
        } else if( a == b || b == c || a == c){
            return lv1;
        } else
            return lv0;
    }
}