package rectangletestconstructor;
class Rectangle{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length*breadth);
    }
   public boolean isSqare(){
       return length==breadth;
   }
}
public class Rectangletestconstructor {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=20.2;
        r.breadth=10.2;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSqare());
        
    }
}
