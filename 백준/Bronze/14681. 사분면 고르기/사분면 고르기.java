import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0){
            if(b>0){
                System.out.print(1);    
            } else
                System.out.print(4);
        } else{
            if(b>0){
                System.out.print(2);
            } else
                System.out.print(3);
        }
    }
}