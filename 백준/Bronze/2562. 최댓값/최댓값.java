import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int index = -1;
        for(int i = 0 ;i<9 ;i++){
            int a = Integer.parseInt(br.readLine());
            if(max < a){
                max=a;
                index = i+1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(max+"\n"+index);
        bw.close();
    }
}