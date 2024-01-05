import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int range = 1;
        int answer = 1;
        while(answer < num){
            range++;
            answer+=range;
        }
        answer-=range-1;
        String result = "";
        if(range%2 == 0){
            result += ""+(1+num-answer)+"/"+((range+1)-(1+num-answer));
        } else
            result += ""+((range+1)-(1+num-answer))+"/"+(1+num-answer);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}