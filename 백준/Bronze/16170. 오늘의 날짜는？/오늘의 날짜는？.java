import java.util.*;

public class Main{
    public static void main(String[] aa){
    	Date d = new Date();
    	System.out.println(d.getYear()+1900);
    	if(d.getMonth()+1 < 10) {
    		System.out.println("0"+d.getMonth()+1);
    	} else
    		System.out.println(d.getMonth()+1);
    	System.out.println(d.getDate());
    }
}