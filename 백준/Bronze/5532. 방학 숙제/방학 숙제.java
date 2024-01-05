import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int kor = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int korD = Integer.parseInt(br.readLine());
        int mathD = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(kor/korD == math/mathD){
            if(kor%korD > 0 || math%mathD >0){
                bw.write(""+(len-(kor/korD+1)));
            } else
                bw.write(""+(len-kor/korD));
        } else if(kor/korD > math/mathD){
            if(kor%korD>0){
                bw.write(""+(len-(kor/korD+1)));
            } else
                bw.write(""+(len-kor/korD));
        } else{
            if(math%mathD>0){
                bw.write(""+(len-(math/mathD+1)));
            } else
                bw.write(""+(len-math/mathD));
        }
        bw.close();
    }
}