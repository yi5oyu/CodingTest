import java.util.*;
import java.io.*;

public class Main{
    public static int kar(int a){
        if(a<96){
            a=(a+13)%91;
            if(a<65)
            	a+=65;
        } else {
            a=(a+13)%123;
            if(a<97) 
            	a+=97;
        }
        return a;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<str.length() ;i++){
            if(str.charAt(i) > 64){
                bw.write(""+(char)kar(str.charAt(i)));
            }else if(str.charAt(i) == 32){
                bw.write(" ");
            }else
                bw.write(""+str.charAt(i));
        }
        bw.close();
    }
}