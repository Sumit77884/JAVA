package listdemo;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90,100));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        System.out.println(al1.contains(50));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(70));
        al1.set(6,110);
        System.out.println(al1);
        System.out.println(al1.lastIndexOf(70));
        for(int i=0;i<al1.size();i++)
            System.out.print(al1.get(i)+" ");
        
        for(var x:al1){
            System.out.print(x+" ");
        }
        ListIterator<Integer> it=al1.listIterator();
        System.out.println();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
    }
    
}
