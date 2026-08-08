package throwthrowsthread;
public class ThrowThrowsThread {
    static int meth1(){
            return 10/0;
        }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        meth3();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //we can handle exception any where in main ,in meth1,in meth2 or in meth3
    }
    
}
