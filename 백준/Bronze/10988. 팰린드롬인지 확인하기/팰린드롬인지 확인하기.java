import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strA = br.readLine();
        String strB = "";
        for(int i = strA.length()-1;i>=0;i--)
            strB += ""+ strA.charAt(i);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(strA.equals(strB)){
            bw.write("1");
        } else
            bw.write("0");
        bw.close();
    }
}