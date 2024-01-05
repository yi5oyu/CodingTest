import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 9 ; i >= 0 ; i--){
            int a = 0;
            for(int j = 0 ; j<str.length() ; j++){
                if(str.charAt(j)-48 == i)
                    a++;
            }
            for(int j = 0 ; j<a ;j++)
                bw.write(""+i);
        }
        bw.close();
    }
}