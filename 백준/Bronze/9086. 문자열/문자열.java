import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0;i<len;i++){
            String a = br.readLine();
            bw.write(""+a.charAt(0)+""+a.charAt(a.length()-1)+"\n");
        }
        bw.close();
    }
}