package superconst;
class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length=breadth=1;
        System.out.println("1");
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
        System.out.println("2");
    }
}
class Cuboid extends Rectangle {
    int height;
    Cuboid(){
        height=1;
        System.out.println("3");
    }
    Cuboid(int h){
        height=h;
        System.out.println("4");
    }
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
        System.out.println("5");
    }
    int volume(){
        System.out.println("6");
        return length*breadth*height;
    }
}

public class Superconst {
    public static void main(String[] args) {
        // TODO code application logic here
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
        
    }
    
}
