import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intarr = {1,1,2,2,2,8};
        String result = "";
        for(int i = 0 ;i<intarr.length ;i++)
            result += ""+ (intarr[i] -Integer.parseInt(st.nextToken()))+" ";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}