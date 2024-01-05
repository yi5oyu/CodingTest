import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int sq = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int i = 0 ;i<str.length() ;i++){
        	int a = 0;
        	if(str.charAt(i)>64) {
        		a = (int)str.charAt(i)-55;
        	} else
        		a = (int)str.charAt(i)-48;
            int b = 1;
            for(int j = str.length()-1-i ;j>0 ;j--)
                b*=sq;
            answer += a*b;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}