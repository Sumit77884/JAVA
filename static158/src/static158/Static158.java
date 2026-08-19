package static158;
class Test{
    public  void show(){
        System.out.println("final1");
    }
}
class Test1 extends Test{
    public void show(){
        System.out.println("final key word prevent from inheritance");
    }
}
public class Static158 {
    final float PI;
    public Static158(){
        PI=3.1425f;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
    }
    
}
