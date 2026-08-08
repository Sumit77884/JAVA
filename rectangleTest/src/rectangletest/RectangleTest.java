package rectangletest;
class Rectangle{
    private double breadth;
    private double length;
    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }
}
public class RectangleTest {

   
    public static void main(String[] args) {
       Rectangle r=new Rectangle();
       r.setLength(10.5);
       r.setBreadth(5.5);
       System.out.println(r.area());
       System.out.println(r.perimeter());
       System.out.println(r.isSquare());
       System.out.println(r.getLength());
       System.out.println(r.getBreath());
    }
}
