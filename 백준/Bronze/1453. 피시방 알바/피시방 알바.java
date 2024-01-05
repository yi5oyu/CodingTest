import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<String,Integer> pcMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i = 0;i<len;i++){
            String input = st.nextToken();
            if(pcMap.containsKey(input)){
                sum++;
            } else
                pcMap.put(input,1);
        }
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}