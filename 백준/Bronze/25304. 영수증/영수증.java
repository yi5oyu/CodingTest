import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int money =sc.nextInt();
        int num = sc.nextInt();
        int result = 0;
        for(int i = 0 ;i<num ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result += a*b;
        }
        if(money == result){
            System.out.print("Yes");
        } else
            System.out.print("No");
    }
}