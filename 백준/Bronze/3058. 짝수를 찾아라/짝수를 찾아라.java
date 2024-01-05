import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int min = 101;
            int sum = 0;
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                if(a%2 == 0){
                    if(a<min)
                        min = a;
                    sum+=a;
                }
            }
            bw.write(""+sum+" "+min+"\n");
        }
        bw.close();
    }
}