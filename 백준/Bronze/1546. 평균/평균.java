import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] intArr = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        for(int i = 0;i<len;i++){
            intArr[i] = Integer.parseInt(st.nextToken());
            if(max < intArr[i])
                max = intArr[i];
        }
        double sum = 0;
        for(int i = 0;i<len;i++){
            sum += (double)intArr[i]/(double)max*100;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum/len);
        bw.close();
    }
}