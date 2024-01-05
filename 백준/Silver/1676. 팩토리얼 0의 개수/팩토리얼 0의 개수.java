import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int fact = 1;
        int sum = 0;
        for(int i = 1 ;i<=len ;i++) {
        	fact*=i;
        	if(fact%10 ==0) {
        		fact/=10;
        		sum++;
        	}
        	if(fact>1000000)
        		fact%=1000000;
        }
        String strFact = ""+fact;
        for(int i = strFact.length()-1 ;i>0 ;i--){
            if(strFact.charAt(i) != '0')
                break;
            sum++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}