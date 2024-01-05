import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<String,ArrayList<Integer>> pointMap = new HashMap<>();
        StringTokenizer st;
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String y = st.nextToken();
            if(pointMap.containsKey(y)){
                ArrayList<Integer> intList= pointMap.get(y);
                intList.add(x);
                pointMap.put(y,intList);
            } else{
                ArrayList<Integer> intList = new ArrayList<Integer>();
                intList.add(x);
                pointMap.put(y,intList);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = -100000 ;i<=100000 ;i++){
            if(pointMap.containsKey(""+i)){
                ArrayList<Integer> intList = pointMap.get(""+i);
                Collections.sort(intList);
                for(int j = 0 ;j<intList.size() ;j++)
                    bw.write(""+intList.get(j)+" "+i+"\n");
            }
        }
        bw.close();
    }
}