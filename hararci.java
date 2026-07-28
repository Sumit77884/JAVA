class Parent{
    void display(){
        System.out.println("Base");
    }
}
class Child1 extends Parent{
    void print(){
        System.out.println("derived1");
    }
}
class Child2 extends Parent{
    void print(){
        System.out.println("derived2");
    }
}
public class hararci {
    public static void main(String[] args){
        Parent obj1 =new Parent();
        obj1.display();
        Child1 obj2 =new Child1();
        obj2.print();
        obj2.display();
        Child2 obj3 =new Child2();
        obj3.print();
        obj3.display();
    }
    
}
