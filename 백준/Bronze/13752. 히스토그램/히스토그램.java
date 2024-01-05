import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            int a = Integer.parseInt(br.readLine());
            for(int j = 0 ;j<a ;j++)
                bw.write("=");
            bw.write("\n");
        }
        bw.close();
            
        
    }
}