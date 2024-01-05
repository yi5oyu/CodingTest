import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int len = num;
        String answer = "";
        for(int i = 2;i<=len ;i++){
            if(num%i ==0){
                answer += ""+i+"\n";
                num/=i;
                i--;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(len == 1){
            bw.write("");
        } else
            bw.write(answer);
        bw.close();
    }
}