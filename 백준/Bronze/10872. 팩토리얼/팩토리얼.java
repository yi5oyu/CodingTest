import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 1;
        for(int i = 1 ; i<=num ; i++)
            answer*=i;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}