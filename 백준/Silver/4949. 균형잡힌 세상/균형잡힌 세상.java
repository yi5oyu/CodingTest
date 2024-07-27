import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aaa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        String answer = "";
        while(!(str = br.readLine()).equals(".")){
            List<String> arr = new ArrayList<>();
            boolean b = true;
            for(int i = 0 ; i<str.length() ;i++){
                if(arr.size() == 0 && (str.charAt(i) == ')' || str.charAt(i) == ']')){
                    b = false;
                    break;
                } else if(str.charAt(i) == ')'){
                    if(!arr.remove(arr.size()-1).equals("(")){
                        b = false;
                        break;
                    }
                } else if(str.charAt(i) == ']'){
                    if(!arr.remove(arr.size()-1).equals("[")){
                        b = false;
                        break;
                    }
                } else if(str.charAt(i) == '('){
                    arr.add("(");
                } else if(str.charAt(i) == '['){
                    arr.add("[");
                }
            }
            answer += (arr.size() == 0 && b) ? "yes\n" : "no\n";
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer);
        bw.close();
    }
}