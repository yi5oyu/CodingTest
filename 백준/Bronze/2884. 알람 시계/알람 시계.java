import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>=45){
            b-=45;
        } else{
            b+=15;
            if(a == 0){
                a=23;
            } else
                a--;
        }
        System.out.print(a+" "+b);
    }
}