import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        int min = 101;
        int[] intArr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        for(int i = 0 ; i<intArr.length ;i++){
            if(intArr[i]>max)
                max =intArr[i];
            if(intArr[i]<min)
                min=intArr[i];
        }
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int mid = 0;
        for(int i = 0 ;i<intArr.length ;i++){
            if(intArr[i]!=max && intArr[i]!=min)
                mid =intArr[i];
        }
        for(int i = 0 ;i<str.length() ;i++){
            if(str.charAt(i) == 'A')
                bw.write(""+min+" ");
            if(str.charAt(i)=='B')
                bw.write(""+mid+" ");
            if(str.charAt(i)=='C')
                bw.write(""+max+" ");
        }
        bw.close();
    }
}