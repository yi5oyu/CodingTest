import java.util.*;
import java.io.*;

public class Main{
    static int[][] map;
    static int n;
    static int m;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!(str = br.readLine()).equals("0 0")){
            int answer = 0;
            st = new StringTokenizer(str);
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            map = new int[m][n];
            for(int i = 0 ; i<m ;i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j<n ;j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0 ; i<m ;i++){
                for(int j = 0 ; j<n ;j++){
                    if(map[i][j] == 1){
                        answer++;
                        blob(i, j);
                    }
                }
            }
            bw.write(""+answer+"\n");
        }
        bw.close();
    }
    static void blob(int x, int y){
        if(x<0 || y<0 || x>=m || y>=n || map[x][y] != 1)
            return;
        map[x][y] = 2;
        blob(x-1,y);
        blob(x+1,y);
        blob(x-1,y-1);
        blob(x+1,y-1);
        blob(x,y-1);
        blob(x,y+1);
        blob(x+1,y+1);
        blob(x-1,y+1);
    }
}