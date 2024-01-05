import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minA = 101;
        int minB = 100;
        int sum = 0;
        for(int i = 0 ;i<4 ;i++){
            int a = Integer.parseInt(br.readLine());
            if(a<minA)
                minA =a;
            sum+=a;
        }
        for(int i = 0 ;i<2 ;i++){
            int a =Integer.parseInt(br.readLine());
            if(a<minB)
                minB=a;
            sum+=a;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sum-minA-minB));
        bw.close();
    }
}