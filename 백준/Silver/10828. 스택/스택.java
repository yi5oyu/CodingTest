import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                intList.add(Integer.parseInt(st.nextToken()));
            } else if(str.equals("pop")){
                if(intList.size() == 0){
                    bw.write("-1\n");
                } else
                    bw.write(""+intList.remove(intList.size()-1)+"\n");
            } else if(str.equals("size")){
                bw.write(""+intList.size()+"\n");
            } else if(str.equals("empty")){
                if(intList.size() == 0){
                    bw.write("1\n");
                } else
                    bw.write("0\n");
            } else{
                if(intList.size() == 0){
                    bw.write("-1\n");
                } else
                    bw.write(""+intList.get(intList.size()-1)+"\n");                
            }
        }
        bw.close();
    }
}