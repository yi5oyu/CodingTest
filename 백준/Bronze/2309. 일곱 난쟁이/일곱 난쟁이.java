import java.util.*;
import java.io.*;

public class Main{
	static int[] a;
    static List<Integer> intList;
    public static void main(String[] aa) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        intList = new ArrayList<>();
        for(int i = 0 ; i<9 ;i++)
        	intList.add(Integer.parseInt(br.readLine()));
        Collections.sort(intList);
        pick(0, new int[7], 0);
		Arrays.sort(a);
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  for(int i = 0 ; i<a.length ; i++) 
			  bw.write(""+a[i]+"\n"); 
		  bw.close();
		 
    }
    static void pick(int index, int[] intArr, int sum){
        if(index == 7) {
        	if(sum == 100) {
        		a = Arrays.copyOf(intArr, intArr.length);
        	}
        	return ;
        }
        for(int i = 0 ; i<intList.size() ;i++){
            if(intList.get(i) > 0){
                int store = intList.get(i);
                intList.set(i , -1);
                intArr[index] = store;
                index++;
                pick(index, intArr, sum + store);
                index--;
                intList.set(i, store);
                intArr[index] = 0;
            }
        }
    }
}