import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long num = Long.parseLong(br.readLine());
        StringTokenizer tt = new StringTokenizer(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long t = Long.parseLong(st.nextToken());
        Long p = Long.parseLong(st.nextToken());
        Long totalT = 0L;
        while(tt.hasMoreTokens()){
            Long ts = Long.parseLong(tt.nextToken());
            totalT += ts/t;
            if(ts%t != 0)
                totalT++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+totalT+"\n");
        bw.write(""+num/p+" "+num%p);
        bw.close();
    }
}