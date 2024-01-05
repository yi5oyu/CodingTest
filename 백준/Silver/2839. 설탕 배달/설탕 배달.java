import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = num/5 ;i>0 ;i--){
            if((num-(5*i))%3 == 0){
                answer += i;
                num-=(i*5);
                break;
            }
        }
        if(num%3 == 0){
            answer+=num/3;
        } else
            answer = -1;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}