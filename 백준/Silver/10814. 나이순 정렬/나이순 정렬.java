import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Map<Integer,String> ageMap = new HashMap<>();
        StringTokenizer st;
        for(int i = 0 ;i<len ;i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String store = "";
            if(ageMap.containsKey(age)){
                store = ageMap.get(age);
                store += "/"+name;
                ageMap.put(age,store);
            } else
                ageMap.put(age, name);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1 ;i<=200 ;i++){
            if(ageMap.containsKey(i)){
                String[] strArr = ageMap.get(i).split("/");
                for(int j = 0 ;j<strArr.length ;j++){
                    bw.write(i+" " +strArr[j]+"\n");
                }
            }
        }
        bw.close();
    }
}