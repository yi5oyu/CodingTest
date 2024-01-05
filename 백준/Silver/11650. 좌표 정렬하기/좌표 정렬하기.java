import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<String,ArrayList<Integer>> pointMap = new HashMap<>();
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            if(pointMap.containsKey(x)){
            	ArrayList<Integer> arrayList;
            	arrayList = pointMap.get(x);
            	arrayList.add(y);
                pointMap.put(x,arrayList);
            } else {
            	ArrayList<Integer> arrayList = new ArrayList<Integer>();
            	arrayList.add(y);
            	pointMap.put(x,arrayList);
            }
                
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = -100000 ;i<=100000 ; i++){
            if(pointMap.containsKey(""+i)){
            	ArrayList<Integer> arrayList = pointMap.get(""+i);
            	Collections.sort(arrayList);
                for(int j = 0 ;j<arrayList.size() ;j++)
                    bw.write(""+i+" "+arrayList.get(j)+"\n");
            }
        }
        bw.close();
    }
}