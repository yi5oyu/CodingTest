import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] bollArr = new boolean[100][100];
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            for(int j = x ;j<x+10 ;j++){
                for(int k = y;k<y+10;k++)
                    bollArr[j][k] = true;
            }
        }
        int answer = 0;
        for(int i = 0 ;i<bollArr.length ;i++){
            for(int j = 0 ;j<bollArr.length ;j++){
                if(bollArr[i][j])
                    answer++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}