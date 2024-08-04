import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int answer = 0;
        List<Integer> wallet = new ArrayList<>();
        for(int i = 0 ; i<num ;i++)
            wallet.add(Integer.parseInt(br.readLine()));
        while(money>0){
            int m = wallet.remove(wallet.size()-1);
            answer += money/m;
            money%=m;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.flush();
        bw.close();
        br.close();
    }
}