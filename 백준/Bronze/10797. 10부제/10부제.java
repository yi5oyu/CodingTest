import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String goal = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0 ;
        for(int i = 0 ;i<5 ;i++){
            if(goal.equals(st.nextToken()))
                count++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count);
        bw.close();
    }
}