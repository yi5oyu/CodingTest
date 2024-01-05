import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lenA = Integer.parseInt(st.nextToken());
        int lenB = Integer.parseInt(st.nextToken());
        int[][] intArr = new int[lenA][lenB];
        for(int i = 0 ;i<lenA*2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ;j<lenB ;j++){
                int a = Integer.parseInt(st.nextToken());
                intArr[i%lenA][j] += a;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<lenA ;i++){
            String str = "";
            for(int j = 0 ; j<lenB;j++){
                str+= ""+intArr[i][j]+" ";
            }
            bw.write(str+"\n");
        }
        bw.close();
    }
}