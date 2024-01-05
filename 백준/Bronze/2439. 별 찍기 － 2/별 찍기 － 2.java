import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i = 0 ;i<len ;i++){
            for(int j = 1; j<len-i;j++)
                System.out.print(" ");
            for(int j = 0; j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}