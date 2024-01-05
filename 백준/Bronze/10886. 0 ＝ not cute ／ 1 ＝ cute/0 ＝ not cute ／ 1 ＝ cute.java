import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0 ; i<len ;i++){
            if(br.readLine().equals("1"))
                count++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(len/2 <count){
            bw.write("Junhee is cute!");
        } else
            bw.write("Junhee is not cute!");
        bw.close();
    }
}