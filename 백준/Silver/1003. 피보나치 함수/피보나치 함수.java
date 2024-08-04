import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i = 2 ; i<=40 ;i++)
            arr.add(arr.get(i-2)+arr.get(i-1));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        for(int i = 0 ; i<num ;i++) {
            answer = Integer.parseInt(br.readLine());
            if(answer > 0){
                bw.write(arr.get(answer-1) + " " + arr.get(answer));
            }
            else
                bw.write("1 0");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}