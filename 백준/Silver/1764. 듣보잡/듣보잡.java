import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ear = Integer.parseInt(st.nextToken());
        int see = Integer.parseInt(st.nextToken());
        List<String> answer = new ArrayList<>();
        int count = 0;
        Map<String, Boolean> arr = new HashMap<>();
        String str = "";
        for(int i = 0 ; i<ear ;i++){
            str = br.readLine();
            arr.put(str, true);
        }
        for(int i = 0 ; i<see ;i++){
            str = br.readLine();
            Boolean b = arr.putIfAbsent(str, true);
            if(b!=null && b){
                count++;
                answer.add(str);
            }
        }
        Collections.sort(answer);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count+"\n");
        for(String s : answer)
            bw.write(s+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}