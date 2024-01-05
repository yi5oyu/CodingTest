import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            Double num = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()){
                String input = st.nextToken();
                if(input.equals("@")){
                    num*=3.0;
                } else if(input.equals("%")){
                    num+=5.0;
                } else
                    num-=7.0;
            }
            bw.write(String.format("%.2f",num)+"\n");
        }
        bw.close();
    }
}