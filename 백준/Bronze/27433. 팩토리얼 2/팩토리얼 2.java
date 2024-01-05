import java.util.*;

public class Main{
	public static Long pac(Long a){
	    if(a>1){
	        a *=pac(--a);
	    } else
            a =1L;
	    return a;
	}
    public static void main(String[] aa){
        Scanner sc = new Scanner(System.in);
    	System.out.println(pac(sc.nextLong()));
    }
}