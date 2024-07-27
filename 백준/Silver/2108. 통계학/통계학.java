import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = -4001;
        int min = 4001;
        int count = 0;
        int[] counter = new int[8001];
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i<num ;i++){
            int n = Integer.parseInt(br.readLine());
            arr.add(n);
            counter[4000+n]++;
            if(count < counter[4000+n])
                count = counter[4000+n];
            sum += n;
            if(max < n)
                max = n;
            if(min > n)
                min = n;
        }
        int a = (int)Math.round(((sum*(1.0)/num)*10)/10);
        Collections.sort(arr);
        int b = arr.get((int)(Math.floor(num/2)));
        int d = Math.abs(max-min);
        int c = 0;
        int judge = 0;
        for(int i = 0 ; i<counter.length ;i++){
            if(counter[i] == count){
                c = i-4000;
                if(judge >= 1)
                    break;
                judge++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+a+"\n");
        bw.write(""+b+"\n");
        bw.write(""+c+"\n");
        bw.write(""+d);
        bw.close();
    }
}