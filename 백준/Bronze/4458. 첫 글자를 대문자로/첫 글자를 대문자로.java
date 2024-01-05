import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            String str = br.readLine();
            if(str.charAt(0) >95)
                str = ""+(char)(str.charAt(0)-32) + str.substring(1);
            bw.write(str+"\n");
        }
        bw.close();
    }
}