import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String answer = "";
        while((num = Integer.parseInt(br.readLine())) != -1){
            answer += ""+num;
            int sum = 0;
            for(int i = 1 ;i<num ;i++){
                if(num%i == 0)
                    sum += i;
            }
            if(sum != num){
                answer += " is NOT perfect.";
            } else{
                for(int i = 1 ;i<num ;i++){
                    if(num%i == 0){
                        sum += i;
                        if(i == 1){
                            answer += " = "+i;
                        } else
                            answer += " + "+i;
                    }
                }                
            }
            answer += "\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}