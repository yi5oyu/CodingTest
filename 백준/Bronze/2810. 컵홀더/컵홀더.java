import java.util.*;
import java.io.*;

public class Main{
    public static int len(String str){
        str = str.replaceAll("S|LL","A ");
        return str.split("A").length;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        int s = 0;
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) == 'S')
                s++;
        }
        int max = len(str);
        int ll = max-1-s;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(max >  s+ll*2){
            bw.write(""+(s+ll*2));
        } else
            bw.write(""+max);
        bw.close();
    }
}