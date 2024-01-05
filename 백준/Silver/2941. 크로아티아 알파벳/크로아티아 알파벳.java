import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i = 0 ;i<strArr.length;i++)
            str = str.replace(strArr[i],""+i);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+str.length());
        bw.close();
    }
}