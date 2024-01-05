import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for(int i = 0 ;i<8 ;i++){
            String str = br.readLine();
            for(int j = 0 ;j<8 ;j++){
                if((i+j)%2==0 && str.charAt(j) == 'F')
                    answer++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}