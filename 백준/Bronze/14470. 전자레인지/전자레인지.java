import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int currentT = Integer.parseInt(br.readLine());
        int aimT = Integer.parseInt(br.readLine());
        int toZero = Integer.parseInt(br.readLine());
        int zeroT = Integer.parseInt(br.readLine());
        int toAim = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(currentT > 0){
            bw.write(""+((aimT-currentT)*toAim));
        } else
            bw.write(""+((toZero*Math.abs(currentT))+zeroT+(aimT*toAim)));
        bw.close();
    }
}