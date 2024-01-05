import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int[] intarr = new int[len];
        int num = Integer.parseInt(st.nextToken());
        for(int i = 0 ;i<num ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j = a-1;j<b;j++){
                intarr[j] =c;
            }
        }
        String a = "";
        for(int i = 0 ;i<intarr.length ;i++){
            a += ""+intarr[i] +" ";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a);
        bw.close();
    }
}