import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxA = 2001;
        int maxB = 2001;
        for(int i = 0 ;i<5 ;i++){
            int price = Integer.parseInt(br.readLine());
            if(i<3 && price<maxA){
                maxA = price;
            } else if(price<maxB)
                maxB =price;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(maxA+maxB-50));
        bw.close();
    }
}