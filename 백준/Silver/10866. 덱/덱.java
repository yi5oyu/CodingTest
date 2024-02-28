import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> l = new ArrayList<>();
        StringTokenizer st;
        String str = "";
        int a = 0;
        for(int i = 0 ; i<len ;i++){
            str = br.readLine();
            if(str.contains("push_front")){
                st = new StringTokenizer(str);
                st.nextToken();
                a = Integer.parseInt(st.nextToken());
                l.add(0, a);
            }
            if(str.contains("push_back")){
                st = new StringTokenizer(str);
                st.nextToken();
                a = Integer.parseInt(st.nextToken());
                l.add(a);
            }
            if(str.equals("pop_front")){
                if(l.size()==0)
                    bw.write("-1\n");
                else 
                    bw.write(""+l.remove(0)+"\n");
            }
            if(str.equals("pop_back")){
                if(l.size()==0)
                    bw.write("-1\n");
                else 
                    bw.write(""+l.remove(l.size()-1)+"\n");
            }
            if(str.equals("size")){
                bw.write(""+l.size()+"\n");
            }
            if(str.equals("empty")){
                if(l.size()==0)
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            if(str.equals("front")){
                if(l.size()==0)
                    bw.write("-1\n");
                else 
                    bw.write(""+l.get(0)+"\n");
            }
            if(str.equals("back")){
                if(l.size()==0)
                    bw.write("-1\n");
                else 
                    bw.write(""+l.get(l.size()-1)+"\n");
            }            
        }
        bw.close();
    }
}