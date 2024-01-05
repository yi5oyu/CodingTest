import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            int num = Integer.parseInt(br.readLine());
            String answer ="";
            for(int j =524288 ;j>0 ;j/=2){
                if(num/j != 0){
                    answer += "1";
                    num%=j;
                } else
                    answer += "0";
            }
            int s = 0;
            for(int z = answer.length()-1 ;z>=0 ;z--){
                if(answer.charAt(z) == '1')
                    bw.write(""+s +" ");
                s++;
            }
            bw.write("\n");
        }
        bw.close();
    }
}