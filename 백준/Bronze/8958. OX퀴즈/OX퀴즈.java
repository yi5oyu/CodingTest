import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len;i++){
            String str = br.readLine();
            int score = 0;
            int answer = 0;
            for(int j = 0 ;j<str.length() ;j++){
                if(str.charAt(j) == 'O'){
                    score++;
                    answer += score;
                }
                if(str.charAt(j) == 'X')
                    score = 0;
            }
            bw.write(""+answer+"\n");
        }
        bw.close();
    }
}