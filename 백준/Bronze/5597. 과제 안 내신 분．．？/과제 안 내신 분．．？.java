import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bb = 28;
        int[] intarr = new int[30];
        while(bb-->0){
            int a = Integer.parseInt(br.readLine());
            intarr[a-1] = a;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<intarr.length ;i++){
            if(intarr[i] < 1)
                bw.write(""+(i+1)+"\n");
        }
        bw.close(); 
    }
}