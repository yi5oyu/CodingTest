import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(br.readLine());
        String answer = "";
        answer += ""+(time/300)+" ";
        time%=300;
        answer += ""+(time/60)+" ";
        time%=60;
        answer += ""+(time/10);
        time%=10;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(time != 0){
            bw.write("-1");
        } else
            bw.write(answer);
        bw.close();
    }
}