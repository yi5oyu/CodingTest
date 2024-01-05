import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        while(st.hasMoreTokens()){
            if(num == Integer.parseInt(st.nextToken()))
                answer++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}