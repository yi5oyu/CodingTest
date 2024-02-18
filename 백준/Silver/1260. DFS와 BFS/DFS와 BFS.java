import java.util.*;
import java.io.*;

public class Main{
    static Map<String, ArrayList<Integer>> map;
    static boolean[] visited;
    static String answerA = "";
    static String answerB = "";
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dot = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        visited = new boolean[dot+1];
        map = new HashMap<>();
        for(int i = 0 ; i<line ;i++){
            st = new StringTokenizer(br.readLine());
            String strA = st.nextToken();
            String strB = st.nextToken();
            map.putIfAbsent(strA, new ArrayList<>());
            map.get(strA).add(Integer.parseInt(strB));
            map.putIfAbsent(strB, new ArrayList<>());
            map.get(strB).add(Integer.parseInt(strA));
        }
        dfs(start);
        visited = new boolean[dot+1];
        bfs(start);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answerA+"\n"+answerB);
        bw.close();
    }
    static void dfs(int s){
        if(visited[s])
            return;
        answerA += ""+s+" ";
        visited[s] = true;
        if(map.get(""+s) != null){
        	Collections.sort(map.get(""+s));
            for(int i = 0 ; i<map.get(""+s).size() ;i++)
                dfs(map.get(""+s).get(i));
        }
    }
    static void bfs(int s){
        answerB = ""+s;
        visited[s] = true;
        List<Integer> q = new ArrayList<>();
        if(map.get(""+s) != null){
	        Collections.sort(map.get(""+s));
	        for(int i = 0 ; i<map.get(""+s).size() ;i++)
	            q.add(map.get(""+s).get(i));
        }
        while(!q.isEmpty()){
            int a = q.remove(0);
            if(!visited[a]){
                visited[a] = true;
                answerB += " "+a;
                if(map.get(""+a) != null){
                	Collections.sort(map.get(""+a));
                    for(int i = 0 ; i<map.get(""+a).size() ;i++)
                        q.add(map.get(""+a).get(i));                 
                }
            }
        }
    }
}