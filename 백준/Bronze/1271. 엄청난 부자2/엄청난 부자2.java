import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bigIntA = new BigInteger(st.nextToken());
        BigInteger bigIntB = new BigInteger(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(bigIntA.divide(bigIntB))+"\n");
        bw.write(""+(bigIntA.remainder(bigIntB)));
        bw.close();
    }
}