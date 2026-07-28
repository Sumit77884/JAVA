public class MethodPractice{
     int max(int x,int y){
        if(x>y) return x;
        else return y;
    }
    public static void main(String [] args){
        int a=10, b=15;
       // System.out.println(max(a,b));
       MethodPractice obj=new MethodPractice();
       System.out.println(obj.max(a,b));

    }
}