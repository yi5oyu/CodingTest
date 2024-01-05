import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String answer = "";
        while(true){
            st = new StringTokenizer(br.readLine());
            int[] intArr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
                           Integer.parseInt(st.nextToken())};
            if(intArr[0]+intArr[1]+intArr[2] == 0)
                break;
            int max = 0;
            int index = -1;
            for(int i = 0 ;i<intArr.length ;i++){
                if(intArr[i] > max){
                    max = intArr[i];
                    index = i;
                }
            }
            int sum = 0;
            for(int i = 0 ;i<intArr.length ;i++){
                if(i != index)
                    sum+=intArr[i];
            }
            if(max >= sum){
                answer += "Invalid\n";
            } else if(intArr[0] == intArr[1] && intArr[1] ==intArr[2]){
                answer += "Equilateral\n";
            } else if(intArr[0] == intArr[1] || intArr[1] == intArr[2] || intArr[0] == intArr[2]){
                answer += "Isosceles\n";
            } else
                answer += "Scalene\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}