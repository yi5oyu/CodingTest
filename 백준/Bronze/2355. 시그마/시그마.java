import java.util.*;
import java.io.*;

public class Main{
    public static Long sumArr(Long a, Long b){
        if(a>=0 && b>=0){
            return (a+b)*(b-a+1)/2;
        } else if(a<0 && b<0){
            return ((a+b)*(b-a+1)/2);
        } else
            return (Math.abs(a)+1+b)*(b-Math.abs(a))/2;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long sum = 0L;
        if(a<b)
            sum = sumArr(a,b);
        else
            sum = sumArr(b,a);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}