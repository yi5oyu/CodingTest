import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String answer = "";
        for(int i = 0 ; i<3 ;i++){
            String a = br.readLine();
            if(!(a.equals("Fizz") || a.equals("Buzz") || a.equals("FizzBuzz"))){
                 num = Integer.parseInt(a)+(3-i);
                 break;
            }
        }
        if(num%15 == 0)
            answer = "FizzBuzz";
        else if(num%5 == 0)
            answer = "Buzz";
        else if(num%3 == 0)
            answer = "Fizz";
        else
            answer = ""+num;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}