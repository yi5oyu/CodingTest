import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            int a = 0;
            String[] strArr = br.readLine().split(",");
            for(int j = 0 ;j<strArr.length ;j++)
                a += Integer.parseInt(strArr[j]);
            bw.write(""+a+"\n");
        }
        bw.close();
    }
}