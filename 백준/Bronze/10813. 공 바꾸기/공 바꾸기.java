import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int[] intarr = new int[len];
        for(int i = 0 ; i<intarr.length;i++)
            intarr[i] = i+1;
        int num = Integer.parseInt(st.nextToken());
        for(int i = 0 ;i<num ;i++){
            int swap = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            swap = intarr[a-1];
            intarr[a-1] = intarr[b-1];
            intarr[b-1] = swap;
        }
        String result = "";
        for(int i = 0 ;i<intarr.length ;i++)
            result += "" +intarr[i] +" ";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}