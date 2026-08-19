package property1;
import java.util.*;
import java.io.*;
public class Property1 {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Properties p=new Properties();
        p.setProperty("Brand","DELL");
        p.setProperty("Processor","i7");
        p.setProperty("OS","Windows10");
        p.setProperty("Model","Latitide");
        p.storeToXML(new FileOutputStream("MyData.xml"),"Laptop");
        p.load(new FileInputStream("MyData.xml"));
        System.out.println(p);
    }
    
}
