import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[5];
        int sum = 0;
        for(int i = 0 ;i<5 ;i++){
            int a = Integer.parseInt(br.readLine());
            sum+=a;
            intArr[i] = a;
        }
        for(int i = 0 ; i<intArr.length;i++){
            for(int j = 0; j<i;j++){
                if(intArr[j]<intArr[i]){
                    int swap = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = swap;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(sum/5)+"\n"+intArr[2]);
        bw.close();
    }
}