import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double num = Double.parseDouble(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(int)(num*0.78)+" ");
        bw.write(""+(int)((num*0.8)+((num*0.2)*0.78)));
        bw.close();
    }
}