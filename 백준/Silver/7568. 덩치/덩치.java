import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> w = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        String[] ranking = new String[num];

        for(int i = 0 ; i<num ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w.add(Integer.parseInt(st.nextToken()));
            h.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0 ; i<num ;i++){
            int rank = 1;
            for(int j = 0 ; j<num ;j++){
                if(j!=i && w.get(j) > w.get(i) && h.get(j) > h.get(i))
                    rank++;
            }
            ranking[i] = ""+rank;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<num ;i++)
            bw.write(ranking[i]+ " ");
        bw.close();
    }
}