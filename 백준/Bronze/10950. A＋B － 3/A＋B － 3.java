import java.util.*;

public class Main{
    public static void main(String[]aa){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] intarr = new int[len];
        for(int i = 0 ;i<intarr.length ;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            intarr[i] = a+b;
        }
        for(int i =0;i<intarr.length;i++){
            System.out.println(intarr[i]);
        }
    }
}