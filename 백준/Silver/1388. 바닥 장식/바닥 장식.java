import java.util.*;
import java.io.*;

public class Main{
    static String[][] strArr;
    static int col;
    static int row;
    static int sum = 0;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        strArr = new String[col][row];
        for(int i = 0 ; i<col ;i++){
            String str = br.readLine();
            for(int j = 0 ; j<row ;j++) {
            	strArr[i][j] = ""+str.charAt(j);
            }
        }
        for(int i = 0 ; i<col ;i++){
            cols(i, 0);
        }
        for(int i = 0 ; i<row ;i++){
            rows(i, 0);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(""+sum);
        bw.close();
    }
    static public void cols(int c, int index){
        if(index >= row)
            return;
        if(index==0 && strArr[c][index].equals("-")){
            sum++;
        } else if(index>0 && !strArr[c][index-1].equals("-") && strArr[c][index].equals("-"))
            sum++;
        cols(c, index+1);
    }
    static public void rows(int c, int index){
        if(index >= col) {
        	return;
        }
        if(index==0 && strArr[index][c].equals("|")){
            sum++;
        } else if(index>0 && !strArr[index-1][c].equals("|") && strArr[index][c].equals("|"))
            sum++;
        rows(c, index+1);
    }
}