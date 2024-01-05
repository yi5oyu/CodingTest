import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while((input = br.readLine())!=null){
            st = new StringTokenizer(input);
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken()) - h;
            m = Integer.parseInt(st.nextToken()) - m;
            s = Integer.parseInt(st.nextToken()) - s;
            if(s<0){
                s+=60;
                m-=1;
            }
            if(m<0){
                m+=60;
                h-=1;
            }
            bw.write(""+h+" "+m+" "+s+" \n");
        }
        bw.close();
    }
}