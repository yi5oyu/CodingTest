import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] aa) throws IOException{
        Set<Integer> s = new HashSet<>();
        for(int i = 1 ;i<=10000 ;i++){
            int a = loop(""+i);
            if(!s.contains(a))
                s.add(a);
        }
        for(int i = 1 ; i<10001 ;i++)
            if(!s.contains(i))
                System.out.println(i);
    }
    static public int loop(String str){
        int init = Integer.parseInt(str);
        for(int i = 0 ; i<str.length() ;i++)
            init += str.charAt(i) - 48;
        return init;
    } 
}