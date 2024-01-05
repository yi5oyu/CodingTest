import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fixNum = Integer.parseInt(st.nextToken());
        int fIndex = Integer.parseInt(st.nextToken());
        int answer = 0;
        int num = 0;
        for(int i = 1 ;i<=fixNum ;i++){
            if(fixNum%i == 0){
                answer++;
                if(answer == fIndex){
                    num = i;
                    break;
                }
            }
        }
        if(answer < fIndex)
            num = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+num);
        bw.close();
    }
}