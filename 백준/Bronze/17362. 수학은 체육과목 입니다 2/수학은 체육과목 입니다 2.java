import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(num<6){
            bw.write(""+num);
        } else{
            if(num%2 == 0){
                if(num%8 == 0 || num%8 == 2){
                    bw.write("2");
                }else
                    bw.write("4");
            } else{
                if((num-1)%8 == 0){
                    bw.write("1");
                } else if((num-5)%8 == 0){
                    bw.write("5");
                } else
                    bw.write("3");
            }
        }
        bw.close();
    }
}