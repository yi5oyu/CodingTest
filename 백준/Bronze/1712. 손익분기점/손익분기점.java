import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int i = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(b>=c){
            bw.write("-1");
        } else{
            bw.write(""+ (a/(c-b) +1));
        }
        bw.close();
    }
}