import java.util.*;
public class ArrayPractice{
    public static void main(String[] args){
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        int key;
        int max=0;
        int max1=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a key:");
        key=sc.nextInt();
        for(int i=0;i<B.length;i++){
            if(key==B[i]){
                System.out.println("Element Found at Index:"+i);
               // System.exit(0);
            }
            if(max<B[i]){
                max1=max;
                max=B[i];
            }        
        }
        System.out.println("Not found");
        System.out.println("Max Element:"+max);
        System.out.println("Second max Element:"+max1);

    }
}