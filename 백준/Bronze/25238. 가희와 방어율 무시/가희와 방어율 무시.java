import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double def = Double.parseDouble(st.nextToken());
        Double per = 100.0 - Double.parseDouble(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(def*(per/100)>=100){
            bw.write("0");
        } else
            bw.write("1");
        bw.close();
    }
}