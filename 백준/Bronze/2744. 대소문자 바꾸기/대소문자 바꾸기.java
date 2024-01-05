import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >96){
                answer += ""+(char)(str.charAt(i)-32);
            } else
                answer += ""+(char)(str.charAt(i)+32);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}