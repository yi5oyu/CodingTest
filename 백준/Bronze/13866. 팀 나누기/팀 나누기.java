import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[4];
        int max = -1;
        int maxi = -1;
        int min = 10001;
        int mini = -1;
        for(int i = 0 ; i<intArr.length;i++){
            int a = Integer.parseInt(st.nextToken());
            if(a>max){
                maxi = i;
                max = a;                
            }
            if(a<min){
                mini = i;
                min =a; 
            }
            intArr[i] = a;
        }
        int sum = 0;
        boolean b = true;
        for(int i = 0 ;i<intArr.length ;i++){
            if(i!=maxi && i!=mini)
                sum += intArr[i];
            if(intArr[0] != intArr[i])
            	b = false;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(b) {
        	bw.write("0");
        } else
        	bw.write(""+Math.abs(sum-(max+min)));
        
        bw.close();
    }
}