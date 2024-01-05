import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String strA = st.nextToken();
        String strB = st.nextToken();
        Long sumB = 0L;
        for(int i = 0 ;i<strB.length() ;i++)
            sumB += strB.charAt(i)-48;
        Long sumA = 0L;
        for(int i = 0 ;i<strA.length();i++)
            sumA += (strA.charAt(i)-48) * sumB;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sumA);
        bw.close();
    }
}