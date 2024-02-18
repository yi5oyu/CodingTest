import java.util.*;
import java.io.*;

public class Main{
    static Map<String, ArrayList<Integer>> graph;
    static boolean[] visited;
    static int dot;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        dot = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        visited = new boolean[dot];
        graph = new HashMap<>();
        int answer = 0;
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            String strA = st.nextToken();
            String strB = st.nextToken();
            graph.putIfAbsent(strA, new ArrayList<>());
            graph.get(strA).add(Integer.parseInt(strB));
            graph.putIfAbsent(strB, new ArrayList<>());
            graph.get(strB).add(Integer.parseInt(strA));
        }
        for(int i = 0 ; i<dot ;i++){
            if(!visited[i]){
                answer++;
                loop(i);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
    static void loop(int i){
        if(visited[i] || i>=dot){
            return;
        }
        visited[i] = true;
        i++;
        if(graph.get(""+i) != null){
            for(int j = 0 ; j<graph.get(""+i).size() ;j++){
            	if(!visited[graph.get(""+i).get(j)-1])
            		loop(graph.get(""+i).get(j)-1);
            }
        }
    }
}