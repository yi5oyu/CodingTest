import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intList = new ArrayList<Integer>();
        String input="";
        int count = 0;
        while((input = br.readLine())!=null){
            int a = Integer.parseInt(input);
            boolean b = true;
            if(count == 0){
                intList.add(a%42);
                count++;
            } else{
                for(int i = 0 ;i<intList.size() ;i++){
                    if(intList.get(i) == a%42)
                        b =false;
                }
                if(b){
                    intList.add(a%42);
                    count++;                    
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+count);
        bw.close();
    }
}