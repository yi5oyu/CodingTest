import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String aaa ="";
        String bbb = "";
        for(int i = 2 ;i>=0 ;i--){
            aaa += ""+ a.charAt(i);
            bbb += ""+ b.charAt(i);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(Integer.parseInt(aaa) > Integer.parseInt(bbb)){
            bw.write(aaa);
        } else
            bw.write(bbb);
        bw.close();
    }
}