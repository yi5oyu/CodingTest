import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        a = a.replaceAll("6","5");
        b = b.replaceAll("6","5");
        int min = Integer.parseInt(a) + Integer.parseInt(b);
        a = a.replaceAll("5","6");
        b = b.replaceAll("5","6");
        int max = Integer.parseInt(a) + Integer.parseInt(b);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+min+" "+max);
        bw.close();
    }
}