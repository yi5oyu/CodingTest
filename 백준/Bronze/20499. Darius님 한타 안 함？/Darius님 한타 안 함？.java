import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("/");
        int k = Integer.parseInt(strArr[0]);
        int d = Integer.parseInt(strArr[1]);
        int a = Integer.parseInt(strArr[2]);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(d==0 || k+a<d){
            bw.write("hasu");
        } else
            bw.write("gosu");
        bw.close();
    }
}