import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for(int i = 0 ;i<str.length() ;i++){
            int a = (int)str.charAt(i);
            if(68>a){
                sum+=2;
            } else if(71>a){
                sum+=3;
            } else if(74>a){
                sum+=4;
            } else if(77>a){
                sum+=5;
            } else if(80>a){
                sum+=6;
            } else if(84>a){
                sum+=7;
            } else if(87>a){
                sum+=8;
            } else
                sum+=9;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sum+str.length()));
        bw.close();
    }
}