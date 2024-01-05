import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa )  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken()) -1;
            String str = st.nextToken();
            for(int j = 0 ;j<str.length() ;j++){
                if(j!=index)
                    bw.write(""+str.charAt(j));
            }
            bw.write("\n");
        }
        bw.close();
    }
}