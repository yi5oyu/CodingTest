import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = ""; 
        while(!(input = br.readLine()).equals("END")){
            for(int i = input.length()-1 ;i>=0 ;i--)
                bw.write(""+input.charAt(i));
            bw.write("\n");
        }
        bw.close();
    }
}