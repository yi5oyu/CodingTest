import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chi = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());
        int getchi = coke/2 + beer;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(chi >= getchi){
            bw.write(""+getchi);
        } else
            bw.write(""+chi);
        bw.close();
    }
}