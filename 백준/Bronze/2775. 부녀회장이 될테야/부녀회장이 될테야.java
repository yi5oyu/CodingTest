import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<List<Integer>> arrs = new ArrayList<>();
        List<Integer> mem = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
        arrs.add(mem);
        for(int i = 0 ; i<14 ;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0 ; j<14 ;j++){
                int sum = 0;
                for(int z = 0 ; z<=j ;z++)
                    sum += arrs.get(i).get(z);
                arr.add(sum);
            }
            arrs.add(arr);
        }
        String answer = "";
        for(int i = 0 ; i<num ;i++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            answer += ""+arrs.get(floor).get(room-1)+"\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}