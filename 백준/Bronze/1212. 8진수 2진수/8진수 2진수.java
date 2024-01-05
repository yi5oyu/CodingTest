import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean b = false;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<str.length() ;i++){
            int a = str.charAt(i)-48;
            for(int j = 4 ;j>0 ;j/=2){
                if(a/j > 0){
                    bw.write("1");
                    a%=j;
                    b=true;
                } else{
                    if(b)
                        bw.write("0");
                }
            }
        }
        if(!b)
        	bw.write("0");
        bw.close();
    }
}