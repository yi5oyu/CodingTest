import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine())*3+Integer.parseInt(br.readLine())*2+Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine())*3+Integer.parseInt(br.readLine())*2+Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a>b){
            bw.write("A");
        } else if(a==b){
            bw.write("T");
        } else
            bw.write("B");
        bw.close();
    }
}