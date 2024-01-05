import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int a = 100;
        int b= 100;
        StringTokenizer st;
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int diceA = Integer.parseInt(st.nextToken());
            int diceB = Integer.parseInt(st.nextToken());
            if(diceA > diceB){
                b -= diceA;
            } else if(diceA < diceB){
                a -= diceB;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+a+"\n"+b);
        bw.close();
    }
}