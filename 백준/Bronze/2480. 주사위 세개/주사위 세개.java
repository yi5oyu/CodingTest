import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        int[] intarr = {a,b,c};
        if(a==b&& b==c){
            result = 10000+a*1000;
        } else if(a!=b && b!=c && a!=c){
            int max = -1;
            for(int i = 0 ;i<3 ;i++){
                if(max < intarr[i])
                    max = intarr[i];
            }
            result = max*100;
        } else{
            int same = 0;
            for(int i = 0 ;i<intarr.length ;i++){
                for(int j = 0 ;j<intarr.length ;j++){
                    if(i!=j){
                        if(intarr[i] == intarr[j]){
                            same = intarr[j];
                            break;                            
                        }
                    }
                }
                if(same != 0)
                    break;
            }
            result = 1000+same*100;
        }
        System.out.print(result);
    }
}