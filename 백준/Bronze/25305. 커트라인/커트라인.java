import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> intList = new ArrayList<>();
        for(int i = 0 ;i<len ;i++)
            intList.add(Integer.parseInt(st.nextToken()));
        Collections.sort(intList, Collections.reverseOrder());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+intList.get(index-1));
        bw.close();
    }
}