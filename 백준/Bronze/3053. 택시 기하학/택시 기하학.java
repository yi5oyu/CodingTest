import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double r = Double.parseDouble(br.readLine());
        Double pi = 3.14159265358979;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(Math.round((r*r*pi)*1000000)/1000000.0)+"\n"+(r*2*r));
        bw.close();
    }
}