import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<2; i++){
            List<Integer> intList = new ArrayList<>();
            for(int j = 0; j<10 ; j++)
                intList.add(Integer.parseInt(br.readLine()));
            Collections.sort(intList, Collections.reverseOrder());
            int sum = 0;
            for(int j = 0 ; j<3;j++)
                sum += intList.get(j);
            bw.write(""+sum+" ");
        }
        bw.close();
    }
}