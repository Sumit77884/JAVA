package linkedhashset1;
import java.util.*;
public class LinkedHashSet1 {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            @Override
        protected boolean removeEldestEntry(Map.Entry e){
            return size()>5;
        }
    };
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
         String s=lhm.get(2);
         System.out.println(s);
         s=lhm.get(5);
         System.out.println(s);
         s=lhm.get(1);
         System.out.println(s);
         System.out.println(lhm);
         lhm.put(6,"F");
         lhm.forEach((k,v)->System.out.println(k+" "+v));
        
    }
    
}
