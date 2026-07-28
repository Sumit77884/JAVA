class Abc{
    static int count=0;
    static int m=100;

    Abc(){
        count++;
        System.out.println(m);
    }
    static void display(){
        System.out.println(count);
         System.out.println(m);
    }
    static {
        System.out.println("staics");
    }
}
public class static_key {
    public static void main(String [] args){
 Abc A1=new Abc();
 Abc A2=new Abc();
 Abc A3=new Abc();
 Abc A4=new Abc();
 Abc A5=new Abc();
 Abc.display();
    }
}
