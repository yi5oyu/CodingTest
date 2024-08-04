import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int out = Integer.parseInt(st.nextToken());
        Map<String, String> record = new HashMap<>();
        for(int i = 0 ; i<num ;i++){
            st = new StringTokenizer(br.readLine());
            record.put(st.nextToken(), st.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<out ;i++) {
            bw.write(record.get(br.readLine()));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}