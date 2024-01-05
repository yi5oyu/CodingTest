import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i)-3 >=65){
                bw.write(""+(char)(str.charAt(i)-3));
            } else
                bw.write(""+(char)(str.charAt(i)+23));
        }
        bw.close();
    }
}