package throw_area_exception;
class NegativeDimentionException extends Exception{
    public String toString(){
    return "Ngegative Dimention";
    }
}

public class Throw_area_exception {
    static int area(int l,int b) throws NegativeDimentionException
    {
        if(l<0 || b<0)
            throw new NegativeDimentionException();
        return l*b;
    }
    static void meth1() throws NegativeDimentionException{
        System.out.println("Area is"+area(-10,5));
    }

    
    public static void main(String[] args) throws NegativeDimentionException {
        // TODO code application logic here
        meth1();
    }
    
}
