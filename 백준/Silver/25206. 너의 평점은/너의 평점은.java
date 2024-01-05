import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double totalScore = 0.0;
        double totalJudge = 0.0;
        for(int i = 0;i<20;i++){
            st = new StringTokenizer(br.readLine());
            String strA = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String judge = st.nextToken();
            double judgeScore = 0.0;
            if(judge.contains("A")){
                if(judge.contains("+")){
                    judgeScore = 4.5;    
                } else
                    judgeScore = 4.0;
            } else if(judge.contains("B")){
                if(judge.contains("+")){
                    judgeScore = 3.5;    
                } else
                    judgeScore = 3.0;
            } else if(judge.contains("C")){
                if(judge.contains("+")){
                    judgeScore = 2.5;    
                } else
                    judgeScore = 2.0;
            } else if(judge.contains("D")){
                if(judge.contains("+")){
                    judgeScore = 1.5;    
                } else
                    judgeScore = 1.0;
            } else if(judge.contains("F")){
                judgeScore = 0.0;
            } 
            
            if(!(judge.equals("P"))){
                totalJudge += score*judgeScore;
                totalScore += score;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(totalScore == 0.0){
            bw.write("0.000000");    
        } else
            bw.write(""+(totalJudge/totalScore));
        bw.close();
    }
}