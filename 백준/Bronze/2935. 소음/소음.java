import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String ff = br.readLine();
        String b = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(ff.equals("*")){
            a += b.substring(1);
            bw.write(a);
        } else{
            if(a.length() == b.length()){
                a = "2" + a.substring(1);
                bw.write(a);
            } else if(a.length() > b.length()){
                a = a.substring(0,a.length()-b.length()) + b;
                bw.write(a);
            } else{
                b = b.substring(0,b.length()-a.length()) + a;
                bw.write(b);
            }
        }
        bw.close();
    }
}