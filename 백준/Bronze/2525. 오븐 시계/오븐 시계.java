import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a+=c/60;
        b+=c%60;
        a+=b/60;
        b%=60;
        if(a<24){
            
        } else if(a%24 == 0){
            a=0;
        } else
            a%=24;
        System.out.print(a+" "+b);
    }
}