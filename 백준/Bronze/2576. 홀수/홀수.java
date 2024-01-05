import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int min = 101;
        int sum = 0;
        while((input = br.readLine())!=null){
            int a = Integer.parseInt(input);
            if(a%2 != 0){
                if(a < min)
                    min = a;
                sum+=a;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(min != 101){
            bw.write(""+sum+"\n"+min);
        } else
            bw.write("-1");
        bw.close();
    }
}