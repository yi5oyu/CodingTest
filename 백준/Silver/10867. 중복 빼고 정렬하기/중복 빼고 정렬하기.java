import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lines = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i<len ;i++){
            lines = Integer.parseInt(st.nextToken());
            l.add(lines);
        }
        Collections.sort(l);
        int store = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(l.size() > 0){
            lines = l.remove(0);
            if(store != lines){
                bw.write(""+lines+" ");
                store = lines;
            }
        }
        bw.close();
    }
}