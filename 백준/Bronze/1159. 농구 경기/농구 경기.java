import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<String,Integer> mapName = new HashMap<>();
        for(int i = 0 ;i<len ;i++){
            String str = br.readLine();
            if(mapName.containsKey(""+str.charAt(0))){
                int a = mapName.get(""+str.charAt(0));
                mapName.put(""+str.charAt(0),++a);
            } else
                mapName.put(""+str.charAt(0),1);
        }
        String answer = "";
        for(Entry<String, Integer> map : mapName.entrySet()){
            if(map.getValue() >= 5)
                answer += map.getKey();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(answer.isEmpty()){
            bw.write("PREDAJA");
        } else
            bw.write(answer);
        bw.close();
    }
}