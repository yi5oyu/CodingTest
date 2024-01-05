import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intList = new ArrayList<>();
        for(int i = 0 ; i<10 ;i++)
            intList.add(Integer.parseInt(br.readLine()));            
        int sum = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0 ; i<intList.size();i++){
            sum+=intList.get(i);
            if(sum>=100){
                if(i == 0){
                    bw.write(""+sum);
                    break;
                }
                if(sum == 100){
                    bw.write("100");
                    break;
                }
                if(sum-100 == 100-(sum-intList.get(i))) {
                	bw.write(""+sum);
                	break;
                } else if(sum-100 > 100-(sum-intList.get(i))){
                    bw.write(""+(sum-intList.get(i)));
                    break;
                } else{
                    bw.write(""+(sum));
                    break;
                }
            }
            if(i == intList.size()-1){
                bw.write(""+sum);
            }
        }
        bw.close();
    }
}