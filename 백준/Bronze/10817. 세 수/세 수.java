import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[3];
        int index = -1;
        int max = -1;
        for(int i = 0 ;i<3 ;i++){
            int a = Integer.parseInt(st.nextToken());
            if(max < a){
                max = a;
                index = i;
            }
            intArr[i] = a;
        }
        intArr[index] = 0;
        max = -1;
        for(int i = 0 ;i<intArr.length ;i++){
            if(max < intArr[i])
                max = intArr[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+max);
        bw.close();
    }
}