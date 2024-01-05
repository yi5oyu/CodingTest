import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int before = 0;
        int answer = 0;
        int sum = 0;
        for(int i = 0 ; i<len ;i++){
            int a = Integer.parseInt(st.nextToken());
            if(i==0){
                before = a;
            } else{
                if(before<a){
                    sum += a-before;
                } else{
                    sum = 0;
                }
                if(answer < sum)
                    answer = sum;
                before=a;
            }   
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}