import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            str = br.readLine();
            for(int j = 0 ; j<str.length();j++){
                if(str.charAt(j) < 96 ){
                    bw.write(""+(char)(str.charAt(j)+32));
                } else
                    bw.write(""+str.charAt(j));
            }
            bw.write("\n");
        }
        bw.close();
    }
}