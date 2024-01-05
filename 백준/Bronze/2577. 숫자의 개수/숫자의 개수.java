import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        int[] intArr = new int[10];
        String strNum = ""+num;
        for(int i =0 ;i<intArr.length ;i++){
            for(int j = 0 ; j<strNum.length();j++){
                if(i+48 == strNum.charAt(j))
                    intArr[i]++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<intArr.length ;i++)
            bw.write(""+intArr[i]+"\n");
        bw.close();
    }
}