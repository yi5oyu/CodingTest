import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        List<Integer> member = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<num ;i++)
            member.add(Integer.parseInt(st.nextToken()));
        Collections.sort(member);
        for(int i = 0 ; i<num ;i++)
            answer += member.get(i) * (member.size()-i);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.flush();
        bw.close();
        br.close();
    }
}