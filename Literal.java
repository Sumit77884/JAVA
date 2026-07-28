import java.lang.*;
public class Literal {
    public static void main(String arg[]){
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        long l=9999999999L ;
        System.out.println(l);
        int x=-5;
        System.out.println(Integer.toBinaryString(x));
    }
}
