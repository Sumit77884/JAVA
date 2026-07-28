public class No_body_loop {
    public static void main(String args[]){
        int i;
        int sum=0;
        for(i=1;i<=5;sum+=i++);
        //sum=sum+i and i=i+1
        System.out.println("Sum is "+sum);
    }
}
