import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int sum = 10;
        for(int i =1;i<st.length();i++){
            if(st.charAt(i-1) == st.charAt(i)){
                sum+=5;
            } else
                sum+=10;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}