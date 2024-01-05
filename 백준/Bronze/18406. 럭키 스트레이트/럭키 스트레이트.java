import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sumA = 0;
        int sumB = 0;
        for(int i = 0 ; i<str.length() ;i++){
            if(i<str.length()/2)
                sumA += str.charAt(i)-48;
            else
                sumB += str.charAt(i)-48;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sumA == sumB)
            bw.write("LUCKY");
        else
            bw.write("READY");
        bw.close();
    }
}