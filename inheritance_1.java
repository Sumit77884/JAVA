interface c4 {
void func();
default void func3(){
    System.out.println("func2");
}
    
}
interface c5 {
    void func();
    default void func3(){
        System.out.println("Sumit");
    }
}
class c6 implements c4,c5{
    public void func()
    {
        c4.super.func3();
        System.out.println("Hello Sumit");
    }
    public void func3(){
        System.out.println("Func3");
    }
}
    class c1{
        void func(){
                System.out.println("Hello Word");
        }
    }
    class c2 extends c1{
        void func2(){
            super.func();
            System.out.println("hello");
        }
    }
    class c3 extends c1{
void func2(){
    System.out.println("Sumit");
}
    }
    
    public class inheritance_1 {
    
        public static void main(String[] args){
            c2 obj=new c2();
            obj.func();
            obj.func2();
            c6 obj1=new c6();
            obj1.func();
        }
}
