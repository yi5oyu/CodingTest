import java.util.*;
import java.io.*;

public class Main{
    static int[][] farm;
    static boolean[][] visited;
    static int n;
    static int m;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<loop ;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            farm = new int[n][m];
            int len = Integer.parseInt(st.nextToken());
            for(int j = 0 ; j<len ;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[x][y] = 1;
            }
            for(int j = 0 ; j<farm.length ;j++){
                for(int z = 0 ; z<farm[j].length ;z++){
                    if(farm[j][z] == 1){
                        answer++;
                        get(j, z);
                    }
                }
            }
            bw.write(""+answer+"\n");
            answer=0;
        }
        bw.close();
    }
    static void get(int x, int y){
        if(x<0 || y<0 || x>=n || y>=m || farm[x][y] != 1)
            return;
        if(farm[x][y] == 1){
            farm[x][y] = 2;
            get(x-1, y);
            get(x+1, y);
            get(x, y-1);
            get(x, y+1);
        }
    }
}