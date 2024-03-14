import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pop = 0;
        int s = 0;
        StringBuilder answer = new StringBuilder();

        List<Integer> l = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(pop < n){
            int a = Integer.parseInt(br.readLine());
            if(l.size() != 0 && l.get(l.size()-1) == a ){
                answer.append("-\n");
                l.remove(l.size()-1);
                pop++;
            } else{
                if(a < s){
                    answer.delete(0,answer.length());
                    answer.append("NO");
                    break;
                }
                for(int i = s+1 ; i<=a ;i++){
                    l.add(i);
                    answer.append("+\n");
                }
                s = a;
                if(l.get(l.size()-1) == a ){
                    answer.append("-\n");
                    l.remove(l.size()-1);
                    pop++;
                }
            }
        }
        bw.write(answer.toString());
        bw.close();
    }
}