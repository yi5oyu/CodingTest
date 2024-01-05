import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0 ;i<len ;i++)
            intMap.put(Integer.parseInt(st.nextToken()),1);
        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String str = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ; i++){
            str = ""+intMap.get(Integer.parseInt(st.nextToken()));
            if(str.equals("null")){
                bw.write("0\n");
            } else
                bw.write("1\n");
        }
        bw.close();
    }
}