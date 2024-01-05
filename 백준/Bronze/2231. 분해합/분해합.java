import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = len-1 ;i>0 ;i--){
            int a = len - i;
            int sum = 0;
            while(a>0){
                sum += a%10;
                a/=10;
            }
            if(len- i +sum == len){
                answer = len-i;
                break;            
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}