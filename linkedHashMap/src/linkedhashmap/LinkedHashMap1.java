package linkedhashmap;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> hm=new HashMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4,"D");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(6,"A");
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        
        System.out.println(hm);
        String s=lhm.get(5);
        
        System.out.println(s);
        lhm.put(4,"K");
         System.out.println(lhm.get(1));
        System.out.println(hm);  
        System.out.println(lhm);
    }
    
}
