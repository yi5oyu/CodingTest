import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sumA = 0;
        for(int i = 0 ;i<4 ;i++)
            sumA += Integer.parseInt(st.nextToken());
        int sumB = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<4 ;i++)
            sumB += Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sumA >= sumB){
            bw.write(""+sumA);
        }else
            bw.write(""+sumB);
        bw.close();
    }
}