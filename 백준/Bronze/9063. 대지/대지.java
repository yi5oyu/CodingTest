import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[][] intArr = new int[2][len];
        StringTokenizer st;
        for(int i = 0 ;i<intArr[0].length ;i++){
            st = new StringTokenizer(br.readLine());
            intArr[0][i] = Integer.parseInt(st.nextToken());
            intArr[1][i] = Integer.parseInt(st.nextToken());
        }
        int answer = 1;
        for(int i = 0 ;i<intArr.length ;i++){
            int max = -100001;
            int min = 100001;
            for(int j = 0 ;j<intArr[i].length ;j++){
                if(intArr[i][j]>max)
                    max = intArr[i][j];
                if(intArr[i][j]<min)
                    min = intArr[i][j];
            }
            answer *= max-min;
        }
        if(len <2)
            answer = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}