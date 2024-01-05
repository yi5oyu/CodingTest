import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());
        int ta = sum+sub;
        ta/=2;
        int tb = sum-ta;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sum>sub){
        if((sum+sub)%2 == 0){
            if(ta>tb){
                bw.write(""+ta+" "+tb);
            } else
                bw.write(""+tb+" "+ta);
        } else
            bw.write("-1");            
        } else if(sum == sub){
            bw.write("0 0");
        }else
            bw.write("-1");
        
        bw.close();
    }
}