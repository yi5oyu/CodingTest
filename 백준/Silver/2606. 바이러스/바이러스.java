import java.util.*;
import java.io.*;

public class Main{
    static Map<String, ArrayList<Integer>> computerList;
    static boolean[] visited;
    static int answer;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int cp = Integer.parseInt(br.readLine());
        visited = new boolean[len+1];
        StringTokenizer st;
        computerList = new HashMap<>();
        for(int i = 0 ; i<cp ;i++){
            st = new StringTokenizer(br.readLine());
            String strA = st.nextToken();
            String strB = st.nextToken();
            computerList.putIfAbsent(strA, new ArrayList<Integer>());
            computerList.get(strA).add(Integer.parseInt(strB));
            computerList.putIfAbsent(strB, new ArrayList<Integer>());
            computerList.get(strB).add(Integer.parseInt(strA));
        }
        virus(1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(answer-1));
        bw.close();
    }
    static public void virus(int v){
        if(visited[v])
        	return;
        visited[v] = true;
        answer++;
        if(computerList.get(""+v) != null){
        	for(int i = 0 ; i<computerList.get(""+v).size() ; i++) {
        		if(!visited[computerList.get(""+v).get(i)])
        			virus(computerList.get(""+v).get(i));
        	}
        }
    } 
}