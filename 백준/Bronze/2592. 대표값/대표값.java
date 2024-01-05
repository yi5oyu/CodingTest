import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> avgMap = new HashMap<>();
        int sum = 0;
        for(int i = 0 ;i<10 ;i++){
            String a = br.readLine();
            sum+=Integer.parseInt(a)/10;
            if(avgMap.containsKey(a)){
                int g = avgMap.get(a);
                avgMap.put(a,++g);
            } else
                avgMap.put(a,1);
        }
        int max = -1;
        String value = "";
        for(Map.Entry<String,Integer> entry : avgMap.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                value = entry.getKey();
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum+"\n"+value);
        bw.close();
    }
}