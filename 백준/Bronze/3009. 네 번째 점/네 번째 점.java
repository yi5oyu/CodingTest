import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] intArr = new int[2][3];
        for(int i = 0 ;i<3 ;i++){
            st = new StringTokenizer(br.readLine());
            intArr[0][i] = Integer.parseInt(st.nextToken());
            intArr[1][i] = Integer.parseInt(st.nextToken());
        }
        int[] sameArr = new int[2];
        for(int i = 0 ;i<intArr.length; i++){
            for(int j = 0 ;j<intArr[i].length ;j++){
                for(int k = 0 ;k<intArr[i].length ;k++){
                    if(j!=k && intArr[i][j] == intArr[i][k])
                        sameArr[i] = intArr[i][j];
                }
            }
        }
        String answer = "";
        for(int i = 0 ; i<sameArr.length;i++){
            for(int j = 0 ;j<intArr[i].length ;j++){
                if(sameArr[i] != intArr[i][j])
                    answer += ""+intArr[i][j]+" ";
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}