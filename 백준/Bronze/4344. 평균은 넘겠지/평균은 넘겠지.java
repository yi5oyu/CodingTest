import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<len ;i++){
        	st  = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            Double sum = 0.0;
            List<Integer> intList = new ArrayList<>();
            for(int j = 0 ;j<num ;j++){
                int a = Integer.parseInt(st.nextToken());
                intList.add(a);
                sum+=(double)a;
            }
            Double avg = sum/(double)num;
            int count = 0;
            for(int j = 0 ;j<num ;j++){
                if((double)intList.get(j) > avg)
                    count++;
            }
            avg = count/(double)num;
            bw.write(String.format("%.3f",avg*100)+"%\n");
        }
        bw.close();
    }
}