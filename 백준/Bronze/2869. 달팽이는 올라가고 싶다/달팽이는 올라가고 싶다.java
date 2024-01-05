import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        int meter = 0;
        int days = 0;
        days = (len-a)/(a-b) +1;
        if((len-a)%(a-b) != 0) 
        	days++;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+days);
        bw.close();
    }
}