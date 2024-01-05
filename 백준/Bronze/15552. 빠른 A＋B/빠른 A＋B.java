import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer; 

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int len = Integer.parseInt(bf.readLine());
//        int[] intarr = new int[len];
        for(int i = 0 ;i<len ;i++){
        	st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
//        bw.flush();
        bw.close();
    }
}