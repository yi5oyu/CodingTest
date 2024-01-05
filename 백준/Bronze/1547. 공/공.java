import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = "";
        StringTokenizer st;
        String eq = "1";
        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);
            String a = st.nextToken();
            String b = st.nextToken();
            if(a.equals(eq)){
                eq=b;
            } else if(b.equals(eq)){
                eq=a;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(eq);
        bw.close();
    }
}