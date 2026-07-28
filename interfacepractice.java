interface Test{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3(){
        System.out.println("Meth3 OF tEST");
    }
}
interface Test2 extends Test{
    void meth4();
}
class My implements Test2{
    public void meth1(){ System.out.println("Meth1");}
    public void meth2(){ System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class interfacepractice {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Test.X);
        Test.meth3();
        My m=new My();
        m.meth1();
        Test m1=new My();
        m1.meth1();
        m1.meth2();
    }
}
