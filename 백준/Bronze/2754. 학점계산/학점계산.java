import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        answer = answer.replace("A+","4.3");
        answer = answer.replace("A0","4.0");
        answer = answer.replace("A-","3.7");
        answer = answer.replace("B+","3.3");
        answer = answer.replace("B0","3.0");
        answer = answer.replace("B-","2.7");
        answer = answer.replace("C+","2.3");
        answer = answer.replace("C0","2.0");
        answer = answer.replace("C-","1.7");     
        answer = answer.replace("D+","1.3");
        answer = answer.replace("D0","1.0");
        answer = answer.replace("D-","0.7");
        answer = answer.replace("F","0.0");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}