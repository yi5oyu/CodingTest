import java.util.*;
import java.io.*;

public class Main{
    public static int fac(int a){
        if(a<=1)
            return 1;
        else
            return a*fac(a-1);
    }
    public static int par(int n,int k){
        int answer = 1;
        for(int i = n , j = 0;j<k ;i-- ,j++)
            answer *= n;
        return answer;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(fac(n)/(fac(n-k)*fac(k))));
        bw.close();
    }
}