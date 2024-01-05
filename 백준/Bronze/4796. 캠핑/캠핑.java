import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        int cases = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!(input=br.readLine()).equals("0 0 0")){
            cases++;
            int days = 0;
            st  = new StringTokenizer(input);
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            days = (v/p)*l;
            if(v%p<=l)
                days += v%p;
            else
                days += l;
            bw.write("Case "+cases+": "+days+"\n");
        }
        bw.close();
    }
}