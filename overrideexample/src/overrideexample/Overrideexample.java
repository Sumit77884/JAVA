package overrideexample;
class Car{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Chanfed");} 
}
class LuxaryCar extends Car{
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
}
public class Overrideexample {
    public static void main(String[] args) {
        // TODO code application logic here
        Car c=new LuxaryCar();
        c.start();
        c.accelerate();
      //  c.changeGrear();
      //  c.openRoof();
    }
    
}
