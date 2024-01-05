import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] intarr = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<intarr.length ;i++){
            int a = Integer.parseInt(st.nextToken());
            intarr[i] = a;
        }
        int b = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0 ;i<intarr.length ;i++){
            if(intarr[i] == b)
                count++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count);
        bw.close();
    }
}