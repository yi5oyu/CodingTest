import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            List<Integer> intList = new ArrayList<>();
            for(int j = 0; j<10;j++)
                intList.add(Integer.parseInt(st.nextToken()));
            Collections.sort(intList,Collections.reverseOrder());
            bw.write(""+intList.get(2)+"\n");
        }
        bw.close();
    }
}