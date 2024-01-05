import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<String,Integer> sortMap = new HashMap<>();
        for(int i = 0 ;i<len ;i++){
            String str = br.readLine();
            if(sortMap.containsKey(str)){
                int a = sortMap.get(str);
                sortMap.put(str,++a);
            } else
                sortMap.put(str,1);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1 ;i<=10000 ;i++){
            if(sortMap.containsKey(""+i)){
                int a = sortMap.get(""+i);
                for(int j = 0 ;j<a;j++)
                    bw.write(""+i+"\n");
            }
        }
        bw.close();
    }
}