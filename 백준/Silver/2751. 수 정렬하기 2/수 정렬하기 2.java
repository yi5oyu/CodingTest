import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i = 0 ;i<len ;i++)
            intArr.add(Integer.parseInt(br.readLine()));
        Collections.sort(intArr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0 ;i<intArr.size() ;i++)
            bw.write(""+intArr.get(i)+"\n");
        bw.close();
    }
}