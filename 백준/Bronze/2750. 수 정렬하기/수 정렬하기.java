import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] intArr = new int[len];
        for(int i = 0 ;i<len;i++)
            intArr[i] = Integer.parseInt(br.readLine());
        for(int i = 0 ;i<len ;i++){
            for(int j = 0 ;j<i ;j++){
                if(intArr[i]<intArr[j]){
                    int swap = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = swap;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            bw.write(""+intArr[i]+"\n");
        }
        bw.close();
    }
}