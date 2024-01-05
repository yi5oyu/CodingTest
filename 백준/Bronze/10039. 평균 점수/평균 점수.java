import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i = 0 ;i<5 ;i++){
            int score = Integer.parseInt(br.readLine());
            if(score <40){
                score = 40;
                sum+=score;
            } else
                sum += score;
        }
            
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sum/5));
        bw.close();
    }
}