import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 101;
        int answer = 0;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<3 ;i++){
            int a = Integer.parseInt(st.nextToken());
            if(min>a){
                min = a;
                answer = i;
            }
            sum+=a;          
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(sum>=100){
            bw.write("OK");
        } else{
            if(answer==0){
                bw.write("Soongsil");
            } else if(answer==1){
                bw.write("Korea");
            } else
                bw.write("Hanyang");
        }
        bw.close();
    }
}