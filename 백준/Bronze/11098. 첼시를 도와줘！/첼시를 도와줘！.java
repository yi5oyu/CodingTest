import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
            int nums = Integer.parseInt(br.readLine());
            StringTokenizer st;
            int max = -1;
            String vip = "";
            for(int j = 0 ;j<nums ;j++){
                st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                if(price > max){
                    max = price;
                    vip = name;
                }
            }
            bw.write(""+vip+"\n");
        }
        bw.close();
    }
}