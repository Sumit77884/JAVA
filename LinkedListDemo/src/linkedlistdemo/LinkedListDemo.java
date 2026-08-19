package linkedlistdemo;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer>al1=new LinkedList<>();
        LinkedList<Integer>al2=new LinkedList<>(List.of(10,20,30,40,50,60,70,80,90));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        al1.addFirst(3);
        al1.addLast(200);
        ListIterator<Integer> it=al1.listIterator();
        System.out.println();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    
}
