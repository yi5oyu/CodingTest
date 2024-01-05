import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> intList = new ArrayList<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<len ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if(input.equals("push")){
                intList.add(Integer.parseInt(st.nextToken()));
            } else if(input.equals("front")){
                if(intList.size() >0){
                    bw.write(""+intList.get(0)+"\n");
                } else
                    bw.write("-1\n");
            } else if(input.equals("back")){
                if(intList.size()>0){
                    bw.write(""+intList.get(intList.size()-1)+"\n");
                } else
                    bw.write("-1\n");
            } else if(input.equals("size")){
                bw.write(""+intList.size()+"\n");
            } else if(input.equals("empty")){
                if(intList.isEmpty()){
                    bw.write("1\n");
                } else
                    bw.write("0\n");
            } else if(input.equals("pop")){
                if(intList.size()>0){
                    bw.write(""+intList.remove(0)+"\n");
                } else
                    bw.write("-1\n");
            }
        }
        bw.close();
    }
}