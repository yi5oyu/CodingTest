import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        String answer = "<";
        List<Integer> intArr = new ArrayList<>();
        for(int i = 0 ; i<len ;i++)
            intArr.add(i+1);
        int x = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(intArr.size()!=0){
            int c = 0;
            List<Integer> l = new ArrayList<>();
            for(int z : intArr)
                l.add(z);
            for(int i = 0 ; i<l.size() ;i++){
                x++;
                if(x==target){
                    if(intArr.size()==1)
                        answer += ""+l.get(i)+">";
                    else
                        answer += ""+l.get(i)+", ";
                    intArr.remove(i-c);
                    x=0;
                    c++;
                }
            }
        }
        bw.write(answer);
        bw.close();
    }
}