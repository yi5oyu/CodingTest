import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int min = 1000001;
        List<Integer> intList = new ArrayList<>();
        for(int i = 0 ;i<3;i++)
            intList.add(Integer.parseInt(st.nextToken()));
        for(int i = 0 ;i<intList.size();i++){
            if(intList.get(i) > max)
                max = intList.get(i);
            if(intList.get(i)<min)
                min = intList.get(i);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+ min +" ");
        for(int i = 0 ;i<intList.size() ;i++){
            if(intList.get(i) != max && intList.get(i) != min)
                bw.write(""+ intList.get(i) + " ");
        }
        bw.write(""+max);
        bw.close();
    }
}