import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger bigIntA = new BigInteger(br.readLine());
        BigInteger bigIntB = new BigInteger(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(bigIntA.add(bigIntB))+"\n");
        bw.write(""+(bigIntA.subtract(bigIntB))+"\n");
        bw.write(""+(bigIntA.multiply(bigIntB))+"\n");
        bw.close();
    }
}