import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        int answer = 0;
        answer += money/500;
        money%=500;
        answer += money/100;
        money%=100;
        answer += money/50;
        money%=50;
        answer += money/10;
        money%=10;
        answer += money/5;
        answer += money%5;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}