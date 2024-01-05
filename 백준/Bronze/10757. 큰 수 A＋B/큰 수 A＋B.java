import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger bigIntA = new BigInteger(st.nextToken());
        BigInteger bigIntB = new BigInteger(st.nextToken());
        bw.write(""+(bigIntA.add(bigIntB)));
        bw.close();
    }
}