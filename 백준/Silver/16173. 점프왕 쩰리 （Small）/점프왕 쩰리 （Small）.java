import java.util.*;
import java.io.*;

public class Main{
    static int[][] intArr;
    static String answer = "Hing";
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        intArr = new int[len][len];
        StringTokenizer st;
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<len ;j++)
                intArr[i][j] = Integer.parseInt(st.nextToken());
        }
        jump(0, 0);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
    static public void jump(int x, int y){
    	if(x >= intArr.length || y >= intArr.length || intArr[x][y]==0)
    		return;
        if(intArr[x][y]==-1){
            answer = "HaruHaru";
            return;
        }
        jump(x+intArr[x][y], y);
        jump(x, y+intArr[x][y]);
    }
}