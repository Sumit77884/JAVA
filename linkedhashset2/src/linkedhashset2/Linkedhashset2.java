package linkedhashset2;
import java.util.*;
public class Linkedhashset2 {
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> lhs=new HashSet<>(10);
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        System.out.println(lhs);
        Iterator<String> itr=lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Hashtable ht=new Hashtable(10);
             
    }
    
}
