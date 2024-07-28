import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String answer = "";
        for(int i = 0 ; i<num ;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            int count = 0;
            boolean[] b = new boolean[n];
            List<Integer> arr = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<n ;j++)
                arr.add(Integer.parseInt(st.nextToken()));
            int start = 0;
            for(int j = 9 ; j>0 ;j--){
                boolean judge = false;
                for(int k = start ; k<arr.size() ;k++){
                    if(!b[k] && arr.get(k)==j){
                        b[k] = true;
                        count++;
                        if(k == target){
                            judge = true;
                            break;
                        }
                        start = k==arr.size()-1 ? 0 : k+1;
                    }
                }
                for(int k = 0 ; k<arr.size() ;k++){
                    if(!judge && !b[k] && arr.get(k)==j){
                        b[k] = true;
                        count++;
                        if(k == target){
                            judge = true;
                            break;
                        }
                        start = k==arr.size()-1 ? 0 : k+1;
                    }
                }
                if(judge){
                    answer += ""+count+"\n";
                    break;
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}