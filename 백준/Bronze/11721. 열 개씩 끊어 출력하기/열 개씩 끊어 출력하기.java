import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<str.length() ;i++){
        	if(i%10==0 && i!=0){
                bw.write("\n");
            } 
        	bw.write(""+str.charAt(i));
        }
        bw.close();
    }
}