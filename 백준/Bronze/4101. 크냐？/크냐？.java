import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while(!((input = br.readLine()).equals("0 0"))){
            st = new StringTokenizer(input);
            if(Integer.parseInt(st.nextToken())>Integer.parseInt(st.nextToken())){
                bw.write("Yes\n");
            } else
                bw.write("No\n");
        }
        bw.close();
    }
}