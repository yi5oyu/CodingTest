import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for(int i = 0 ; i<len;i++){
            if(str.charAt(i) == 'A')
                a++;
            if(str.charAt(i) == 'B')
                b++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a>b){
            bw.write("A");
        } else if(a==b){
            bw.write("Tie");
        } else
            bw.write("B");
        bw.close();
    }
}