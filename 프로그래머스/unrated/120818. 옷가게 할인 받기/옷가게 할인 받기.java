class Solution {
    public int solution(int price) {
        double answer = 0;
        int discount = 0;
        
        if(price>=500000){
            discount = 1;
        } else if(price>=300000){
            discount = 2;
        } else if(price>=100000){
            discount = 3;
        } else
            discount = 0;
            
        
        switch (discount){
            case 0 :
                answer =  Math.round(((double)price)*100)/100;
                break;
            case 1 :
                answer =  Math.round(((double)price*0.80)*100)/100;
                break;
            case 2 :
                answer =  Math.round(((double)price*0.90)*100)/100;
                break;
            case 3 :
                answer =  Math.round(((double)price*0.95)*100)/100;
                break;
        }
        return (int)answer;
    }
}