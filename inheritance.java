class A{
    void display(){
        System.out.println("welcome");
    }
}
class B extends A{
    void test(){
        System.out.println("test");
    }
}
public class inheritance {
    public static void main(String[] args){
        A obj1 =new A();
        obj1.display();
        B obj2 =new B();
        obj2.test();
        obj2.display();
    }
    
}
