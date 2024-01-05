import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
        }
        bw.close();
    }
}