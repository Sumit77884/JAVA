package overriderules;
class Super{
    private void display(){
        System.out.println("Super display.");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub display.");
    }
}

public class Overriderules {
    public static void main(String[] args) {
        // TODO code application logic here
        Super s=new Sub();
        s.display();
    }
}
