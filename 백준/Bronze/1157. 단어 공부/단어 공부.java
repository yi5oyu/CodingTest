import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] aa) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] intArr = new int[26];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				if ((int) str.charAt(j) > 90) {
					if (i == (int) str.charAt(j) - 97)
						intArr[i]++;
				} else {
					if (i == (int) str.charAt(j) - 65)
						intArr[i]++;
				}
			}
		}
        int max = -1;
        int index = -1;
        for(int i = 0 ;i<intArr.length ;i++){
            if(intArr[i] > max){
                max = intArr[i];
                index = i;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean b = true;
        for(int i = 0 ;i<intArr.length ;i++){
            if(i!=index && intArr[i] == max)
                b = false;
        }
        if(b){
            bw.write(""+(char)(index+65));
        } else
            bw.write("?");
        bw.close();
	}
}