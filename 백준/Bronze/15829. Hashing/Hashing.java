import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i = 0 ;i<len ;i++)
            intList.add(str.charAt(i)-96);
        int sum = 0;
        for(int i = 0 ; i<len ;i++)
            sum+= intList.get(i)*Math.pow(31,i);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}