import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int lenA = 0;
        int lenB = 0;
        lenA = a>b ? b:a;
        lenB = a>b ? a:b;
        String answer = "";
        for(int i = lenA;i>0;i--){
            if(a%i == 0 && b%i==0){
                answer += ""+i+"\n";
                break;
            }
        }
        while(true){
            if(lenB%a == 0 && lenB%b==0){
                answer += ""+lenB;
                break;   
            }
            lenB++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}