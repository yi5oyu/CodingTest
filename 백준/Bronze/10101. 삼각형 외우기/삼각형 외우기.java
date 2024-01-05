import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String answer = "";
        if(a+b+c != 180){
            answer = "Error";
        } else if(a == 60 && b ==60){
            answer = "Equilateral";
        } else if(a == b || a==c || b==c){
            answer = "Isosceles";
        } else
            answer = "Scalene";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}