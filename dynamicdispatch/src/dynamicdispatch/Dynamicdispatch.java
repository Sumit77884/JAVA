package dynamicdispatch;
class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}
class Sub extends Super{
    public void meth2(){
        System.err.println("Sub Meth2");
    }
    public void meth3(){
        System.out.println("Sub Meth3");
    }
}
public class Dynamicdispatch {
    public static void main(String[] args) {
        // TODO code application logic here
        Super sub=new Sub();
         sub.meth1();
         sub.meth2();
    }
}
