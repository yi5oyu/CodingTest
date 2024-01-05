import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int sum = (w/l)*(h/l);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(max>sum){
            bw.write(""+sum);
        } else
            bw.write(""+max);
        bw.close();
    }
}