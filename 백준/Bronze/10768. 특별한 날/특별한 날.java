import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(m ==2){
            if(d == 18){
                bw.write("Special");
            } else if(d<18){
                bw.write("Before");
            } else
                bw.write("After");
        } else if (m<2){
            bw.write("Before");
        } else
            bw.write("After");
        bw.close();
    }
}