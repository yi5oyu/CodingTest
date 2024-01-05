import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        String input = "";
        int guys = 0;
        StringTokenizer st;
        while((input = br.readLine())!=null){
            st = new StringTokenizer(input);
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            guys += in-out;
            if(max < guys)
                max = guys;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+max);
        bw.close();
    }
}