import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i = 1;
        int count = 0;
        int answer = 0;
        while(true){
            for(int j = 0 ;j<i ;j++){
                count++;
                if(count>=a && count<=b)
                    answer += i;
            }
            i++;
            if(count>=b)
                break;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}