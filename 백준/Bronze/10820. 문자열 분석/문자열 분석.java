import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while((str = br.readLine())!=null){
            int s = 0;
            int b = 0;
            int n = 0;
            int bl = 0;
            for(int i = 0 ;i<str.length() ;i++){
                if(str.charAt(i) == 32){
                    bl++;
                } else if(str.charAt(i)>93){
                    s++;
                } else if(str.charAt(i)<64){
                    n++;
                } else
                    b++;
            }
            bw.write(s+" "+b+" "+n+" "+bl+"\n");
        }
        bw.close();
    }
}