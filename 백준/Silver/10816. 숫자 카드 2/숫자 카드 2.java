import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> intMap = new HashMap<>();
        int input = 0;
        int store = 0;
        for(int i = 0 ;i<len ;i++){
            input = Integer.parseInt(st.nextToken());
            if(intMap.containsKey(input)){
                store = intMap.get(input);
                intMap.put(input, ++store);
            } else
                intMap.put(input, 1);
        }
        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            input = Integer.parseInt(st.nextToken());
            if(intMap.containsKey(input)){
                bw.write(""+intMap.get(input)+" ");
            } else
                bw.write("0 ");
        }
        bw.close();
    }
}