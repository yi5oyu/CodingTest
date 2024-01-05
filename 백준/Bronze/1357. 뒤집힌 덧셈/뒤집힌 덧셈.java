import java.util.*;
import java.io.*;

public class Main{
    public static int rev(String str){
        String a = "";
        for(int i = str.length()-1 ;i>=0;i--)
            a += str.charAt(i);
        return Integer.parseInt(a);
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String strA = st.nextToken();
        String strB = st.nextToken();
        int sum = rev(strA)+rev(strB);
        int answer = rev(""+sum);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}