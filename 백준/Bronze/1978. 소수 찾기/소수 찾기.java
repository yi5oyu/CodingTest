import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i = 0; i<len;i++){
            int num = Integer.parseInt(st.nextToken());
            boolean b = true;
            for(int j = 2 ;j<num ;j++){
                if(num%j == 0){
                    b =false;
                    break;
                }
            }
            if(b && num != 1)
                answer++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}