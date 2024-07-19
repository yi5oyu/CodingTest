import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        Map<Integer, Boolean> prime = new HashMap<>();
        for(int i=start ; i<=end ;i++)
            prime.put(i,true);
        for(int i=2; i<=(int)Math.ceil(Math.sqrt(end)) ; i++){
            for(int j=i+i ; j<=end ;j+=i)
                prime.put(j,false);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=start ; i<=end ;i++){
            if(i!=1 && prime.get(i))
                bw.write(""+i+"\n");
        }
        bw.close();
    }
}