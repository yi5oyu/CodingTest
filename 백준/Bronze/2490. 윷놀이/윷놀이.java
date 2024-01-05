import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa )throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while((input = br.readLine())!=null){
            st = new StringTokenizer(input);
            int sum = 0;
            while(st.hasMoreTokens())
                sum+=Integer.parseInt(st.nextToken());
            switch(sum){
                case 0:
                    bw.write("D\n");
                    break;
                case 1:
                    bw.write("C\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("A\n");
                    break;
                case 4:
                    bw.write("E\n");
                    break;
            }
        }
        bw.close();
    }
}