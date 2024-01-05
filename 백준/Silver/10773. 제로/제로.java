import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i = 0 ;i<len;i++){
            int a = Integer.parseInt(br.readLine());
            if(a > 0){
                intList.add(a);
            } else
                intList.remove(intList.size()-1);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for(int i = 0 ; i<intList.size();i++)
            sum+=intList.get(i);
        bw.write(""+sum);
        bw.close();
    }
}