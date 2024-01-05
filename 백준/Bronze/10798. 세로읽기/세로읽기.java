import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[15];
        for(int i = 0 ;i<strArr.length ;i++)
            strArr[i] = "";
        for(int i = 0 ;i<5 ;i++){
            String str = br.readLine();
            for(int j = 0 ;j<str.length() ;j++)
                strArr[j] += ""+str.charAt(j);
        }
        String result = "";
        for(int i = 0 ;i<strArr.length ;i++)
            result += strArr[i];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}