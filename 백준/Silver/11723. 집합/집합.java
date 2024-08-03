import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[] b = new boolean[20];
        boolean[] all = new boolean[20];
        List<String> answer = new ArrayList<>();
        for(int i = 0 ; i<20 ;i++)
            all[i] = true;
        for(int i = 0 ; i<num ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int n = 0;
            if(str.equals("add") || str.equals("remove") || str.equals("check") || str.equals("toggle"))
                n = Integer.parseInt(st.nextToken()) - 1;

            if(str.equals("add")){
                b[n] = true;
            }else if(str.equals("remove")){
                b[n] = false;
            }else if(str.equals("check")){
                answer.add(b[n] ? "1" : "0");
            }else if(str.equals("toggle")){
                b[n] = !b[n];
            }else if(str.equals("all")){
                Arrays.fill(b, true);
            }else
                Arrays.fill(b, false);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String str : answer){
            bw.write(str);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}