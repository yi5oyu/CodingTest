import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int[] atoz = new int[26];
        for(int i = 0;i<26 ;i++)
            atoz[i] = -1;
        for(int i = 0 ;i<atoz.length;i++){
            for(int j = 0 ;j<str.length() ;j++){
                if(i+97 == (int)str.charAt(j)){
                    atoz[i] =j;
                    break;
                }
            }
        }
        String result = "";
        for(int i = 0 ;i<atoz.length ;i++)
            result += ""+atoz[i]+" ";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.close();
    }
}