import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.substring(0, str.length()-2) +"00";
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a%b==0){
            bw.write("00");
        } else{
            b-=a%b;
            if(b <10){
                bw.write("0"+b);
            } else
                bw.write(""+b);
        }
        bw.close();
    }
}