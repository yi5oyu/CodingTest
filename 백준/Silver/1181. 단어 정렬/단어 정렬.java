import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<String, List<String>> m = new HashMap<>();
        String str = "";
        while( (str = br.readLine()) != null ){
            m.putIfAbsent(""+str.length(), new ArrayList<>());
            if(!m.get(""+str.length()).contains(str))
                m.get(""+str.length()).add(str);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1 ; i<51 ;i++){
            if(m.get(""+i) != null){
                Collections.sort(m.get(""+i));
                while(m.get(""+i).size() != 0){
                    bw.write(m.get(""+i).remove(0)+"\n");
                }
            }
        }
        bw.close();
    }
}