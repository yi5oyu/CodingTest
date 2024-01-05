import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int i = 0 ;
        if(x>2){
            for(i = 2; i<524289 ;i*=2){
                if(i==x){
                    break;
                } else if(i>x){
                    i/=2;
                    x-=i;
                    x*=2;
                    break;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+x);
        bw.close();
    }
}