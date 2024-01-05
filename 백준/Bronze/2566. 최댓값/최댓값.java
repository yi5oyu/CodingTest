import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = -1;
        String index = "";
        for(int i = 0 ;i<9 ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ;j<9 ;j++){
                int a = Integer.parseInt(st.nextToken());
                if(a> max){
                    max = a;
                    index = ""+(i+1)+" "+(j+1);
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+max+"\n"+index);
        bw.close();
    }
}