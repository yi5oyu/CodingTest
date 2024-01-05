import java.util.*;
import java.io.*;

public class Main{
    public static int maxAB(int a, int b){
        if(a>b)
            return b;
        else
            return a;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0;i<len;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int max = maxAB(a,b);
            int answer = 1;
            for(int j = 2 ;j<=max ;j++) {
                if(a%j == 0 && b%j ==0){
                    answer *=j;
                    a/=j;
                    b/=j;
                    j--;
                }
                if(a<=j)
                    break;
            }
            bw.write(""+(a*b*answer)+"\n");
        }
        bw.close();
    }
}