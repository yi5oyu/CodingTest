import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sumY=0;
        int sumK =0;
        for(int i = 0 ;i<len ;i++){
            for(int j = 0 ;j<9 ;j++){
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                sumY +=y;
                sumK +=k;
            }
                if(sumY>sumK){
                    bw.write("Yonsei\n");
                } else if(sumY==sumK){
                    bw.write("Draw\n");
                } else
                    bw.write("Korea\n");
        }
        bw.close();
    }
}