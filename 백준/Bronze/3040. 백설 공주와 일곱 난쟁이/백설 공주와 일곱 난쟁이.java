import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intList = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0 ; i<9 ;i++){
            intList.add(Integer.parseInt(br.readLine()));
            sum += intList.get(i);
        }
        sum -= 100;
        boolean b = false;
        for(int i =0;i<intList.size();i++){
            for(int j = 0 ;j<intList.size() ;j++){
                if(i!=j && intList.get(i)+intList.get(j)==sum){
                    intList.set(i,0);
                    intList.set(j,0);
                    b =true;
                    break;
                }
            }
            if(b)
                break;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<intList.size();i++)
            if(intList.get(i) != 0)
                bw.write(""+intList.get(i)+"\n");
        bw.close();
    }
}