import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String answer = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            int money = Integer.parseInt(br.readLine());
            answer +=""+ money/25+" ";
            money%=25;
            answer +=""+money/10+" ";
            money%=10;
            answer +=""+money/5+" ";
            money%=5;
            answer +=""+money+" ";
            answer +="\n";
        }
        bw.write(answer);
        bw.close();
    }
}