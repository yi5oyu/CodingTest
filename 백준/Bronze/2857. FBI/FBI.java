import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 0;
        for(int i = 1 ; i<=5;i++){
            if(br.readLine().contains("FBI")){
                bw.write(""+i+" ");
                a++;
            }
        }
        if(a==0)
            bw.write("HE GOT AWAY!");
        bw.close();
    }
}