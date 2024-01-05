import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!((input = br.readLine()).equals("0"))){
            String comp = "";
            for(int i = input.length()-1 ;i>=0 ;i--)
                comp += ""+input.charAt(i);
            if(input.equals(comp)){
                bw.write("yes\n");
            } else
                bw.write("no\n");
        }
        bw.close();
    }
}