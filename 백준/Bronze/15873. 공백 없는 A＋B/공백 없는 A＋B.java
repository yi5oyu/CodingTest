import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        if(str.length()<3){
            sum = Integer.parseInt(""+str.charAt(0)) + Integer.parseInt(""+str.charAt(1));
        } else if(str.length() >3){
            sum = 20;
        } else{
            String[] strArr = str.replace("10"," 10 ").split(" ");
            for(int i = 0 ; i<strArr.length ;i++){
                if(!strArr[i].equals(""))
                    sum += Integer.parseInt(strArr[i]);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}