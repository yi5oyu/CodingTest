import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int multi = Integer.parseInt(br.readLine());
        String str = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(!(str=br.readLine()).equals("0")){
            int a = Integer.parseInt(str);
            if(a<multi){
                bw.write(""+a+" is NOT a multiple of "+multi+".\n");
            } else if(a%multi==0){
                bw.write(""+a+" is a multiple of "+multi+".\n");
            } else
                bw.write(""+a+" is NOT a multiple of "+multi+".\n");
        }
        bw.close();
    }
}