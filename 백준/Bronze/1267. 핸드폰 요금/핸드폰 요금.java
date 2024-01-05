import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sumA = 0;
        int sumB = 0;
        for(int i = 0 ; i<count ;i++){
            int sec = Integer.parseInt(st.nextToken());
            sumA += (sec/30+1)*10;
            sumB += (sec/60+1)*15;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sumA == sumB){
            bw.write("Y M "+sumA);
        } else if(sumA < sumB){
            bw.write("Y "+sumA);
        } else
            bw.write("M "+sumB);
        bw.close();
    }
}