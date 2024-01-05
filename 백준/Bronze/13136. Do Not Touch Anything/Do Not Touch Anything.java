import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long r = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());
        Long n = Long.parseLong(st.nextToken());
        Long rc = r/n;
        if(r%n != 0)
            rc++;
        Long cc = c/n;
        if(c%n != 0)
            cc++;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(rc*cc));
        bw.close();
    }
}