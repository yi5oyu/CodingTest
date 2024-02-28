import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger answer = new BigInteger("0");
        BigInteger r = new BigInteger("31");
        for(int i = 0 ; i<str.length() ;i++){
            BigInteger x = new BigInteger(""+(str.charAt(i)-96));
            answer = answer.add(x.multiply(r.pow(i)));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer.remainder(new BigInteger("1234567891")));
        bw.close();
    }
}