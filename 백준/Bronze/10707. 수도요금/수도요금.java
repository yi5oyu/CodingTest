import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int chargeY = Integer.parseInt(br.readLine());
        int limitY = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int use = Integer.parseInt(br.readLine());
        int a = x*use;
        int b = chargeY;
        if(use>limitY)
            b +=(use-limitY)*y;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a>b){
            bw.write(""+b);
        } else
            bw.write(""+a);
        bw.close();
    }
}