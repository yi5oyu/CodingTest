import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<5 ;i++)
            bw.write(""+(Integer.parseInt(st.nextToken())-people)+" ");
        bw.close();
    }
}