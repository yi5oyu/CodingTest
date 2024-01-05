import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<26 ;i++){
            int count = 0;
            for(int j = 0 ;j<str.length() ;j++){
                if(str.charAt(j)-97 == i)
                    count++;
            }
            bw.write(""+count+" ");
        }
        bw.close();
    }
}