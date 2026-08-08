package abstractrules;
abstract class Super{
    abstract public int math1();
}
class Sub extends Super{
    public int math1(){
      return 5;  
    }
}

public class Abstractrules {
    public static void main(String[] args) {
        // TODO code application logic here
        Sub s=new Sub();
        System.out.println(s.math1());
    }
    
}
