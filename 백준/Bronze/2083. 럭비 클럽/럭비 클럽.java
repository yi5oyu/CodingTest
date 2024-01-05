import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!(input = br.readLine()).equals("# 0 0")){
            st = new StringTokenizer(input);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if(age>17 || w>=80){
                bw.write(name+" Senior\n");
            } else
                bw.write(name+" Junior\n");
        }
        bw.close();
    }
}