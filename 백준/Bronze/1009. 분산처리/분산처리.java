import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int answer = 1;
            int num = Integer.parseInt(st.nextToken());
            int times = Integer.parseInt(st.nextToken());
            for(int j =0;j<times;j++){
                answer *= num;
                answer%=10;
            }
            if(answer == 0){
                bw.write("10\n");
            } else
                bw.write(""+answer+"\n");
        }
        bw.close();
    }
}