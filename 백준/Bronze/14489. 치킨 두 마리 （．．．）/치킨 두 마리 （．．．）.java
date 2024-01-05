import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        int chi = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sum>=chi*2){
            bw.write(""+(sum-chi*2));
        } else
            bw.write(""+sum);
        bw.close();
    }
}