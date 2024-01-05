import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] intarr = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<len;i++)
            intarr[i] = Integer.parseInt(st.nextToken());
        int min = 1000001;
        int max = -1000001;
        for(int i = 0 ;i<intarr.length ;i++){
            if(min > intarr[i])
                min = intarr[i];
            if(max < intarr[i])
                max = intarr[i];
        }
        String result = ""+min+" "+max;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}