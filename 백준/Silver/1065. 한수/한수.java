import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 1 ; i<=n ;i++)
            if(judge(i))
                answer++;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
    static public boolean judge(int x){
        if(x<100)
            return true;
        int div = x%10;
        x/=10;
        int store = -1;
        boolean b = true;
        while(x > 0){
            if(b){
                b = false;
                store = (x%10) - div;
            } else if(store != (x%10) - div){
                return false;
            }
            store = (x%10) - div;
            div = x%10;
            x/=10;
        }
        return true;
    }
}