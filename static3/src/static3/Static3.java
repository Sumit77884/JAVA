package static3;
class Test{
    static {
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
public class Static3 {
    static {
        System.out.println("Block 3");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test t1 =new Test();
        
    }
    static {
        System.out.println("Block 4");
    }
    
}
