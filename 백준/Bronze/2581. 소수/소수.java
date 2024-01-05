import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 10001;
        for(int i = start ;i<=end;i++){
            boolean b= true;
            for(int j = 2 ;j<i ;j++){
                if(i%j == 0){
                    b=false;
                    break;
                }
            }
            if(b && i!=1){
                if(min > i)
                    min = i;
                sum += i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sum == 0){
            bw.write("-1");
        } else
            bw.write(""+sum+"\n"+min);
        bw.close();
    }
}