import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int fo = Integer.parseInt(st.nextToken());
        int bo = Integer.parseInt(st.nextToken());
        int fx = n-fo;
        int bx = n-bo;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(fo == bo)
            bw.write(""+n);
        else{
            int sum = 0;
            if(fo > bo)
                sum += bo;
            else
                sum += fo;
            if(fx > bx)
                sum += bx;
            else
                sum += fx;
            bw.write(""+sum);
        }
        bw.close();
    }
}