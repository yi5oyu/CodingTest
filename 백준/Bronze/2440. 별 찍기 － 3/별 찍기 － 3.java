import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa ) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = len ;i>0 ;i--){
            for(int j = 0;j<i;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}