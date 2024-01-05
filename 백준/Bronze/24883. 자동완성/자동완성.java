import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(br.readLine().matches("[nN]")){
            bw.write("Naver D2");
        } else
            bw.write("Naver Whale");
        bw.close();
    }
}