import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(br.readLine().length() >= br.readLine().length()){
            bw.write("go");
        } else
            bw.write("no");
        bw.close();
    }
}