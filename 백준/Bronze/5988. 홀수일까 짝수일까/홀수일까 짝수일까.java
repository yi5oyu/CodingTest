import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            String str = br.readLine();
            int a = str.charAt(str.length()-1)-48;
            if(a%2 == 0){
                bw.write("even\n");
            } else
                bw.write("odd\n");
        }
        bw.close();
    }
}