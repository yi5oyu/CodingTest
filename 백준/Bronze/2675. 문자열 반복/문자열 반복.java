import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i<len;i++){
            st = new StringTokenizer(br.readLine());
            int times = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";
            for(int k = 0 ;k<str.length() ;k++){
                for(int j = 0 ;j<times ;j++){
                    result += ""+str.charAt(k);
                }
            }
            bw.write(result+"\n");
        }
        bw.close();
    }
}