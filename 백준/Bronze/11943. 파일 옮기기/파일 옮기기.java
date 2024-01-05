import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] intArr = new int[2][2];
        for(int i = 0 ; i<2 ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ;j<2 ;j++)
                intArr[i][j] = Integer.parseInt(st.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(intArr[0][0]+intArr[1][1] > intArr[0][1]+intArr[1][0]) {
        	bw.write(""+(intArr[0][1]+intArr[1][0]));
        } else
        	bw.write(""+(intArr[0][0]+intArr[1][1]));
        bw.close();
    }
}