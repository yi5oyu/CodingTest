import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        String[][] judgeArrA = new String[8][8];
        for(int i = 0 ;i<8 ;i++){
            for(int j = 0 ;j<8 ;j++){
                if((i+j)%2 == 0){
                    judgeArrA[i][j] = "W";
                }else
                    judgeArrA[i][j] = "B";
            }
        }
        String[][] judgeArrB = new String[8][8];
        for(int i = 0 ;i<8 ;i++){
            for(int j = 0 ;j<8 ;j++){
                if((i+j)%2 == 0){
                    judgeArrB[i][j] = "B";
                }else
                    judgeArrB[i][j] = "W";
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[][] strArr = new String[a][b];
        for(int i = 0 ;i<a ; i++){
            String str = br.readLine();
            for(int j = 0 ;j<b ;j++)
                strArr[i][j] = ""+str.charAt(j);
        }
        int answer = 1000;
        for(int i = 0 ; i<a-7 ;i++){
            for(int j = 0;j<b-7 ;j++){
                int countA = 0;
                int countB = 0;
                for(int k = 0;k<8 ;k++){
                    for(int z = 0 ;z<8;z++){
                        if(!(judgeArrA[k][z].equals(strArr[k+i][z+j])))
                            countA++;
                        if(!(judgeArrB[k][z].equals(strArr[k+i][z+j])))
                            countB++;
                    }
                }
                if(answer > countA) 
                	answer = countA;
                if(answer > countB) 
                	answer = countB;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}