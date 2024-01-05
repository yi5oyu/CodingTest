import java.util.*;
import java.io.*;

public class Main{
    public static String addO(String str){
        int remain = str.length()%3;
        if(remain == 1)
            str = "00"+str;
        else if(remain ==2)
            str = "0"+str;
        return str;
    }
    public static int makeSum(String str, int a){
        int sum = 0;
        if(a==0){
            if(str.charAt(a) == '1')
                sum=4;
        } else if(a==1){
            if(str.charAt(a) == '1')
                sum=2;
        } else{
            if(str.charAt(a) == '1')
                sum=1;            
        }
        return sum;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = addO(str);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0;i<str.length();i+=3){
            String thr = str.substring(i,i+3);
            int sum = 0;
            for(int j = 0 ;j<3 ;j++)
                sum += makeSum(thr,j);
            bw.write(""+sum);
        }
        bw.close();
    }
}