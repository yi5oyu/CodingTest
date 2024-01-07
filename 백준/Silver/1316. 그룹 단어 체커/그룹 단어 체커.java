import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0 ; i<len ; i++){
            String str = br.readLine();
            boolean b = false;
            int store = 0;
            for(int j = 0 ; j<str.length() ; j++){
                if(str.length()==1)
                    break;
                int a = 1;
                boolean ck = true;
                for(int k = 0 ; k<str.length()-j ; k++){
                    if(j+a == str.length()) {
                    	ck=false;
                    	break;
                    }
                    if(!ck && str.charAt(j) == str.charAt(j+a)){
                    	answer++;
                        b = true;
                        break;
                    }
                    if(ck && str.charAt(j) != str.charAt(j+a))
                        ck = false;
                    a++;
                }
                if(b)
                    break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(len-answer));
        bw.close();
    }
}