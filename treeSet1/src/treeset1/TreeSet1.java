package treeset1;
import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,60,70));
        ts.add(25);
        System.out.println(ts);
        System.out.println(ts.ceiling(55));// number or just greater number in treeset
    }
    
}
