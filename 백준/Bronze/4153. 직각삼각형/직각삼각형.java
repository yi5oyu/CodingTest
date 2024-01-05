import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = -1;
            if(a==0 && b==0 && c==0)
                break;
            int[] intArr = {a,b,c};
            for(int i = 0 ;i<3 ;i++) 
            	if(intArr[i] > max)
            		max = intArr[i];
            int sum = 0;
            for(int i = 0 ;i<3 ;i++) 
            	if(intArr[i] != max)
            		sum += Math.pow(intArr[i],2);
            if(sum == Math.pow(max,2)){
                bw.write("right\n");
            } else
                bw.write("wrong\n");
        }
        bw.close();
    }
}