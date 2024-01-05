import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
            int price = Integer.parseInt(br.readLine());
            int lencase = Integer.parseInt(br.readLine());
            for(int j = 0 ; j<lencase;j++){
                st = new StringTokenizer(br.readLine());
                price += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            bw.write(""+price+"\n");
        }
        bw.close();
    }
}