import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] intArr = new int[5];
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 || b==0){
                intArr[4]++;
            } else if(a>0){
                if(b>0){
                    intArr[0]++;
                } else
                    intArr[3]++;
            } else if(a<0){
                if(b>0){
                    intArr[1]++;
                } else
                    intArr[2]++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Q1: "+intArr[0]+"\nQ2: "+intArr[1]+"\nQ3: "+intArr[2]+"\nQ4: "+intArr[3]+"\nAXIS: "+intArr[4]);
        bw.close();
    }
}