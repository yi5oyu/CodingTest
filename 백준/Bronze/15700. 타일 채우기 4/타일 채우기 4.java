import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long sq = Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sq/2));
        bw.close();
    }
}