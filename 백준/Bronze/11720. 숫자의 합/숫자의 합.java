import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        for(int i = 0;i<len;i++)
            sum += (int)str.charAt(i)-48;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}