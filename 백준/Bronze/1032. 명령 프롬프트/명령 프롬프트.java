import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i = 0 ;i<len-1 ;i++){
            String answer = "";            
            String strComp = br.readLine();
            for(int j = 0;j<str.length() ;j++){
                if(str.charAt(j) == strComp.charAt(j))
                    answer += ""+str.charAt(j);
                else
                    answer += "?";                
            }
            str = answer;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.close();
    }
}