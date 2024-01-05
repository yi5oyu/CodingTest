import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[3];
        //String[] arrs = {"black","brown", ""};
        for(int i = 0 ;i<3 ;i++){
            String str = br.readLine();
            str = str.replace("black","0");
            str = str.replace("brown","1");
            str = str.replace("red","2");
            str = str.replace("orange","3");
            str = str.replace("yellow","4");
            str = str.replace("green","5");
            str = str.replace("blue","6");
            str = str.replace("violet","7");
            str = str.replace("grey","8");
            str = str.replace("white","9");
            strArr[i] = str;
        }
        Long a = Long.parseLong(strArr[0])*10 + Long.parseLong(strArr[1]);
        for(int i = 0 ; i<Integer.parseInt(strArr[2]);i++)
            a*=10;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+a);
        bw.close();
    }
}