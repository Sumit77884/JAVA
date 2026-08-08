package scabstract1;
abstract class Shape{
        double length;
    double breadth;
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}

public class Scabstract1 {

   
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        Shape s=new Rectangle();
        s.length=20;
        s.breadth=10;
        Shape s=r;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println(r.area());
        System.out.println(r.perimeter());
        
    }
    
}
