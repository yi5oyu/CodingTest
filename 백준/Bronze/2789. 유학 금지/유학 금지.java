import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("[A-E]","");
        str = str.replace("M","");
        str = str.replace("R","");
        str = str.replace("I","");
        str = str.replace("G","");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.close();
    }
}