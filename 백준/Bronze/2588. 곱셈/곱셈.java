import java.util.*;

public class Main{
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab1 =a*(b%10);
        int ab2 =a*((b%100 - b%10)/10);
        int ab3 =a*(b/100);
        System.out.println(ab1);
        System.out.println(ab2);
        System.out.println(ab3);
        System.out.println(ab1+ab2*10+ab3*100);
    }
}