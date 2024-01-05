import java.util.*;

public class Main{
    public static void main(String[] aa){
        Date d = new Date();
        int mons = d.getMonth()+1;
        String mon = "";
        if(mons <10)
            mon="0"+mons;
        System.out.print((d.getYear()+1900)+"-"+mon+"-"+d.getDate());
    }
}