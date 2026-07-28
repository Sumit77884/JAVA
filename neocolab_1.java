import java.util.Scanner;

public class neocolab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.next();
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(str);
        System.out.println(ch);
        sc.close();
    }
}