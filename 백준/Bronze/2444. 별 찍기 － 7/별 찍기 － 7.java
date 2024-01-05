import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            for(int j = len-1 ;j>i ;j--)
                bw.write(" ");
            for(int j = 0;j<2*i+1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        int a = 1;
        for(int i = len-2;i>=0;i--){
            for(int j = len-1;j>i;j--)
                bw.write(" ");
            for(int j =0;j<2*i+1;j++)
                bw.write("*");
            bw.write("\n");
        }
        bw.close();
    }
}