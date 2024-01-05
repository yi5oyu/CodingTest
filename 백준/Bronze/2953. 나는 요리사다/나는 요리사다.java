import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[5];
        StringTokenizer st;
        int max = -1;
        for(int i = 0 ;i<intArr.length ;i++){
            int a = 0;
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ;j<4 ;j++)
                a+=Integer.parseInt(st.nextToken());
            intArr[i] = a;
            if(max < a)
                max = a;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0 ;i<intArr.length ;i++){
            if(max == intArr[i])
                bw.write(""+(i+1)+" "+max);
        }
        bw.close();
    }
}