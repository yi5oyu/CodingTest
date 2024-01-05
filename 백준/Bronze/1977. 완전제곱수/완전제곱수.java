import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        for(int i = a ;i<=b ;i++){
            for(int j =1 ;j<=100;j++){
                if(i == j*j){
                    sum+=j*j;
                    if(min == 0)
                        min = j*j;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(min == 0){
            bw.write("-1");
        } else
            bw.write(""+sum+"\n"+min);
        bw.close();
    }
}