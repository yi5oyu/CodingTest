import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[20];
        for(int i =0;i<20;i++)
            intArr[i] = i+1;
        StringTokenizer st;
        for(int i = 0 ;i<10 ;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            List<Integer> intList = new ArrayList<>();
            for(int j = b-1;j>=a-1;j--)
                intList.add(intArr[j]);
            for(int j = a-1, z=0 ; j<=b-1;j++,z++)
                intArr[j]=intList.get(z);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ;i<intArr.length ;i++)
            bw.write(""+intArr[i]+" ");
        bw.close();
    }
}