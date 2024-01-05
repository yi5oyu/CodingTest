import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int[] intArr1 = new int[len];
        int[] intArr2 = new int[len];
        int num = Integer.parseInt(st.nextToken());
        for(int i = 0 ;i<len;i++){
            intArr1[i] = i+1;
            intArr2[i] = i+1;
        }
        for(int i = 0 ;i<num;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = b-1;
            for(int j = a-1 ;j<b ;j++)
                intArr2[j] = intArr1[c--];
            for(int j = 0;j<len;j++)
                intArr1[j] =intArr2[j];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = "";
        for(int i = 0 ;i<intArr1.length ;i++)
            result += ""+intArr1[i]+" ";
        bw.write(result);
        bw.close();
    }
}