import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void method(){
        method();
    }
    public static void main(String[] args){
        try{
            method();
        }
        catch(Error e){
            System.out.println(e);
        }
        try {
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException np){
            System.out.println(np);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            int[] arr =new int [5];
            System.out.println(arr[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            String str ="name";
            System.out.println(str.charAt(4));
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            //int x="name";
        }
        catch(Exception e){
            System.out.println(e);
        }
         try{
            //Scanner sc =new Scanner(System.in);
           // int x=sc.nextInt();
    }
    catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("done");
            System.out.println("done");
        }
    }
}
