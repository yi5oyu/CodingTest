import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int[][] intArr = new int[b][a];
            int count = 0;
            boolean bb = false;
            for(int j = 0;j<b;j++){
                for(int k = 0;k<a;k++){
                    count++;
                    if(num == count){
                        if(j+1 <10){
                            bw.write(""+(k+1)+"0"+(j+1)+"\n");
                        } else
                            bw.write(""+(k+1)+(j+1)+"\n");
                        bb = true;
                        break;
                    }
                }
                if(bb)
                    break;
            }
        }
        bw.close();
    }
}