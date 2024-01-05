import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String answer = "";
        for(int i = 0 ;i<8 ;i++)
            answer += st.nextToken()+" ";
        String a = "1 2 3 4 5 6 7 8 ";
        String b = "8 7 6 5 4 3 2 1 ";
        if(answer.equals(a)){
            answer = "ascending";
        } else if(answer.equals(b)){
            answer = "descending";
        } else
            answer = "mixed";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}