import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        int min = 1001;
        for(int i = 0 ;i<len;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a>max)
                max = a;
            if(a<min)
                min = a;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(max-min));
        bw.close();
    }
}