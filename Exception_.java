import java.util.*;
public class Exception_ {
    public static void main(String [] args){
        int a,b,c;
        Scanner scan =new Scanner(System.in);
          a=scan.nextInt();
          b=scan.nextInt();
          try{
            c=a/b;
            System.out.println(c);
          }
          catch(ArithmeticException e){
            System.out.println(e);

          }
          c=a*b;
          System.out.println(c);
          c=a+b;
          System.out.println(c);
          c=a-b;
          System.out.println(c);
    }
}
