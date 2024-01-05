import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String player = br.readLine();
        String judge = br.readLine();
        StringTokenizer st = new StringTokenizer(player);
        StringTokenizer st1 = new StringTokenizer(judge);
        Long main = Long.parseLong(st1.nextToken());
        Long sub = Long.parseLong(st1.nextToken());
        Long sum = 0L;
        for(int i = 0 ; i<len;i++){
            Long a = Long.parseLong(st.nextToken());
            a-=main;
            sum++;
            if(a>0) {
                sum+=a/sub;
                if(a%sub>0)
                	sum++;            	
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}