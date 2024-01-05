import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while(!(input = br.readLine()).equals("#")){
            for(int i = 0 ;i<input.length() ;i++)
                input = input.replaceAll("[aeiouAEIOU]","-");
            int count = 0;
            for(int i = 0 ;i<input.length() ;i++){
                if(input.charAt(i) == '-')
                    count++;
            }
            bw.write(""+count+"\n");
        }
        bw.close();
    }
}