import java.util.*;
import java.io.*;

public class Main{
	public static String trans(String str) {
		if(str.length() <2) 
			str+=str;
		return str;
	}
	public static String intTrans(String str) {
		int a = Integer.parseInt(""+str.charAt(0));
		int b = Integer.parseInt(""+str.charAt(1));
		return ""+((a+b)%10);
	}
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String setstr = trans(str);
        int sum = 0;
        String answer = "";
        while(!answer.equals(str) && !answer.equals("0"+str)) {
        	answer = ""+setstr.charAt(setstr.length()-1);
        	answer += intTrans(setstr);
        	sum++;
        	setstr= answer;
        }
        if(!str.equals("0") && str.length()<2)
        	sum++;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
}