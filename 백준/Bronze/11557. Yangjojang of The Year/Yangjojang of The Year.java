import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine()); 
        for(int i = 0 ;i<len ;i++){
            int schools = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            for(int j = 0 ;j<schools ;j++){
                st = new StringTokenizer(br.readLine());
                String k = st.nextToken();
                int v = Integer.parseInt(st.nextToken()); 
                map.put(k,v);
            }
            int a = -1;
            String answer = "";
            for(Map.Entry<String, Integer> e : map.entrySet()){
                if(e.getValue() > a){
                    a = e.getValue();
                    answer = e.getKey();
                }
            }
            bw.write(answer+"\n");
        }
        bw.close();
    }
}