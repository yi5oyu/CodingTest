import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            int nums = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j = 0 ;j<nums;j++)
                sum+=Integer.parseInt(st.nextToken());
            bw.write(""+sum+"\n");
        }
        bw.close();
    }
}