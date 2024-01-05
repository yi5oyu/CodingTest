import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int beeHouse = 1;
        int stage = 1;
        while(num > beeHouse){
            beeHouse+=6*stage;
            stage++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(stage));
        bw.close();
    }
}