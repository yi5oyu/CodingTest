import java.util.*;
import java.io.*;

public class Main{
    public static List inputlist(String str){
    	StringTokenizer st = new StringTokenizer(str);
        List<Integer> intlist = new ArrayList<>();
        for(int i = 0 ; i<5 ;i++)
            intlist.add(Integer.parseInt(st.nextToken()));
        return intlist;
    }
    public static String printlist(List<Integer> list){
        String str = "";
        for(int i = 0 ; i<list.size() ;i++)
            str += ""+ list.get(i)+" ";
        return str;
    }
    public static List swaplist(List<Integer> list, int a){
        int store = -1;
        store = list.get(a);
        list.set(a, list.get(a+1));
        list.set(a+1, store);
        return list;
    }
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> intlist = inputlist(br.readLine());
        String answer = "";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 0;
        while(!answer.equals("1 2 3 4 5 ")){
            if(intlist.get(a)>intlist.get(a+1)){
                answer = printlist(swaplist(intlist, a));
                bw.write(answer+"\n");
            }
            a++;
            if(a == (intlist.size()-1))
            	a = 0;
        }
        bw.close();
    }
}