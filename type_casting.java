public class type_casting {
    public static void main(String args[]){
        long L;
        double D;
        L=100123285L;
        D=L;//L=D is impossible
        System.out.println("L and D:"+L+" "+D);
        double x,y;
        byte b;
        int i;
        char ch;
        x=10.0;
        y=3.0;
        i=100;
        i=(int)(x/y);
        System.out.println("Integer outcome of x/y:"+i);
        i=100;
        b=(byte) i;
        System.out.println("Integer putcome of x/y:"+b);
        i=257;
        b=(byte) i;
        System.out.println("Value of b:"+b);
        b=88;//ASCII code for X
        ch=(char) b;
        System.out.println("ch:"+ch);
        b=10;
        i=b*b;
        b=10;
        b=(byte)(b*b);
        System.out.println("i and b:"+i+" "+b);
    }
    }

