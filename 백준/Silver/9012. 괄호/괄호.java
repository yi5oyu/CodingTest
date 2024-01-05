import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            String str = br.readLine();
            while(str.replace("()","") != str) 
            	str = str.replace("()","");
            if(str.isEmpty()){
                bw.write("YES\n");
            } else
                bw.write("NO\n");
        }
        bw.close();
    }
}