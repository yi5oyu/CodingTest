import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intarr = new int[Integer.parseInt(st.nextToken())];
        int comp = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<intarr.length;i++)
            intarr[i] = Integer.parseInt(st.nextToken());
        String a = "";
        for(int i=0;i<intarr.length;i++){
            if(comp > intarr[i])
                a+=intarr[i]+ " ";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a);
        bw.close();
    }
}