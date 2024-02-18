import java.util.*;
import java.io.*;

public class Main{
    static int[][] ground;
    static int len;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        len = Integer.parseInt(br.readLine());
        ground = new int[len][len];
        int count = 0;
        String answer = "";
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i<len ;i++){
            String str = br.readLine();
            for(int j = 0 ; j<len ;j++){
                ground[i][j] = str.charAt(j)-48;
            }
        }
        for(int i = 0 ; i<len ;i++){
            for(int j = 0 ; j<len ;j++){
                if(ground[i][j] == 1){
                    count++;
                    l.add(home(i,j,0));
                }
            }
        }
        Collections.sort(l);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count+"\n");
        for(int i = 0 ; i<l.size();i++) 
        	bw.write(""+l.get(i)+"\n");
        bw.close();
    }
    static int home(int x, int y, int a){
        if(x<0 || y<0 || x>=len || y>=len || ground[x][y] != 1)
            return 0;
        ground[x][y] = 2;
        return 1 + home(x-1,y,1)+home(x+1,y,1)+ home(x,y-1,1)+ home(x,y+1,1);
    }
}