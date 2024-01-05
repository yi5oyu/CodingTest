import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a =1;
        int b =1;
        StringTokenizer st; 
        while(a+b != 0){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a+b != 0) {
            	bw.write(a+b+"\n");
            }
        }
        bw.close();
    }
}