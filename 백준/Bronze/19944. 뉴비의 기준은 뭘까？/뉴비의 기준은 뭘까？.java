import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(m<3){
            bw.write("NEWBIE!\n");
        } else if(m>n){
            bw.write("TLE!\n");
        } else
            bw.write("OLDBIE!\n");
        bw.close();
    }
}