import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        int sum = 0;
        for(int i = len-1 ; i>=0 ; i--){
            String a = "";
            if(str.charAt(i) > 64) {
            	a = ""+ (str.charAt(i) - 55);
            } else
            	a = ""+ str.charAt(i);
            int b = Integer.parseInt(a);
            for(int j = len-1 ; j>i;j--)
                b*=16;
            sum+=b;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}