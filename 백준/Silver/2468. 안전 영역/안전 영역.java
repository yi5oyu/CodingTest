import java.util.*;
import java.io.*;

public class Main{
    static int[][] m;
    static boolean[][] b;
    static int answer = 0;
    static int l;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        l = Integer.parseInt(br.readLine());
        m = new int[l][l];
        StringTokenizer st;
        for(int i = 0 ; i<l ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<l ;j++)
                m[i][j] = Integer.parseInt(st.nextToken());
        }
        for(int z = 0 ; z<100 ;z++){
            b = new boolean[l][l];
            int sum = 0;
            for(int i = 0 ; i<l ;i++){
                for(int j = 0 ; j<l ;j++){
                    if(!b[i][j] && m[i][j]>z){
                        sum++;
                        home(i,j,z);                    
                    }
                }
            }
            if(answer < sum)
                answer = sum;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
    static void home(int x, int y, int z){
        if(x<0 || y<0 || x>=l || y>=l || m[x][y] <= z || b[x][y])
            return;
        b[x][y] = true;
        home(x-1,y,z);
        home(x+1,y,z);
        home(x,y-1,z);
        home(x,y+1,z);
    }
}