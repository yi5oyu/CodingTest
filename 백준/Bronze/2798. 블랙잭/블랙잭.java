import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int[] intArr = new int[len];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<intArr.length ;i++)
            intArr[i] = Integer.parseInt(st.nextToken());
        int answer = 1000001;
        for(int i = 0;i<intArr.length ;i++){
            for(int j = 0 ;j<intArr.length ;j++){
                for(int k = 0 ;k<intArr.length ;k++){
                    if(i!=j && j!=k && i!=k){
                        int sum = max - (intArr[i]+intArr[j]+intArr[k]);
                        if(sum == 0){
                            answer = sum;
                            break;
                        } else if(sum > 0){
                            if(answer > sum)
                                answer = sum;
                        }
                    }
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+(max-answer));
        bw.close();
    }
}