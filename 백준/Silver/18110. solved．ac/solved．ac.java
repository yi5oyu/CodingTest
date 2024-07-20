import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> scores = new ArrayList<>();
        int nums = Integer.parseInt(br.readLine());
        for(int i=0 ; i<nums ;i++)
            scores.add(Integer.parseInt(br.readLine()));
        Collections.sort(scores);
        int div = (int)Math.round(nums*0.15);
        int score = 0;
        for(int i=div ; i<scores.size()-div ;i++)
            score += scores.get(i);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(int)Math.round(score/((scores.size()-(div*2))*1.0))+"\n");
        bw.close();
    }
}