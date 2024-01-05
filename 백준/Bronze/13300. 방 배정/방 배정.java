import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        Map<String,HashMap<String,Integer>> peopleMap = new HashMap<>();
        for(int i = 0 ; i<len ;i++){
            st = new StringTokenizer(br.readLine());
            String sex = st.nextToken();
            String grade = st.nextToken();
            if(peopleMap.containsKey(grade)){
                Map<String,Integer> sexMap = peopleMap.get(grade);
                if(sexMap.containsKey(sex)){
                    int a = sexMap.get(sex);
                    sexMap.put(sex,++a);
                } else
                    sexMap.put(sex,1);
            } else{
                HashMap<String,Integer> sexMap = new HashMap<>();
                sexMap.put(sex,1);
                peopleMap.put(grade,sexMap);
            }
        }
        int answer = 0;
        for(int i = 1 ;i<=6 ;i++){
            if(peopleMap.containsKey(""+i)){
                for(int j = 0 ;j<=1 ;j++){
                    Map<String, Integer> sexMap = peopleMap.get(""+i);
                    if(sexMap.containsKey(""+j)){
                        int a = sexMap.get(""+j);
                        answer += a/max;
                        if(a%max != 0)
                            answer++;
                    }
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+answer);
        bw.close();
    }
}