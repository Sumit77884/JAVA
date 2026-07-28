abstract class Area{
abstract void area();
}
class Circle extends Area{
    void area(){
        double r=12.44,A,PI=3.14;
        A=PI*r*r;
        System.out.println("Area OF cir is : "+A);
    }
}
class Rect extends Area{
    void area(){
        double l=10.5,w=20.4,A;
        A=l*w;
        System.out.println("Area of rec is :"+A);
    }
}



public class abstract_interface {
    public static void main(String[] args){
        Area A =new Circle();
        A.area();
       Area B =new Rect();
       B.area();
    }
}
