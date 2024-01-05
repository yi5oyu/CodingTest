import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
        String input = "";
        while((input = br.readLine())!=null){
            sum+= Integer.parseInt(input);
            count++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sum - --count));
        bw.close();
    }
}