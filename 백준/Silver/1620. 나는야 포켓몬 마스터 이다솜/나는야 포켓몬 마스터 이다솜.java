import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int out = Integer.parseInt(st.nextToken());
        Map<String, Integer> arrS = new HashMap<>();
        Map<Integer, String> arrI = new HashMap<>();
        String str = "";
        for(int i = 1 ; i<=num ;i++){
            str = br.readLine();
            arrS.put(str, i);
            arrI.put(i, str);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<out ;i++) {
            bw.write((str = br.readLine()).charAt(0) > 60 ? "" + (arrS.get(str)) : arrI.get(Integer.parseInt(str)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}