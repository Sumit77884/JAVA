package overriding;
class TV {
    public void swithchON(){System.out.println("TV is Swithched ON");}
    public void changeChannel(){System.out.println("TV Channel is Changed ");}
}
class SmartTV extends TV{
    public void switchON(){System.out.println("Smart TV is Swithched ON");}
    public void changeChannel(){System.out.println("SmartTV Channel is Changed");}
    public void browse(){System.out.println("Smart TV Browsing");}
}
public class Overriding {

    public static void main(String[] args) {
        // TODO code application logic here
        TV t=new SmartTV();
        t.swithchON();
        t.changeChannel();
    }
    
}
