import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        String input = "";
        while(st.hasMoreTokens()){
            input = st.nextToken();
            count++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count);
        bw.close();
    }
}