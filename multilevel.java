class A{
  public  void display(){
        System.out.println("Hai");
    }
}
class B extends A{
   public void display(){
        System.out.println("Hello");
    }
}
class C extends B{
    void foo(){
        System.out.println("Test");
    }
}
public class multilevel {
    private static final String ArrayList = null;

    public static void main(String[] args){
        A obj1 =new A();
        obj1.display();
        B obj2 =new B();
        obj2.display();
        obj2.display();
        C obj3=new C();
        obj3.foo();
        obj3.display();
        obj3.display();
        String str=null;
        System.out.println(str);
       // System.out.println(str.length());
        int []arr= new int[5];
        System.out.println(arr[3]);
        int x;
        System.out.println(x = 10);
        String str1 ="Sumit";
        System.out.println(str1);
        System.out.println(str1.charAt(2));
    }
}
