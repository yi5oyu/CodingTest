import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<a ;i++){
            String input = br.readLine();
            for(int j = b-1 ;j>=0 ;j--)
                bw.write(""+input.charAt(j));
            bw.write("\n");
        }
        bw.close();
    }    
}
 