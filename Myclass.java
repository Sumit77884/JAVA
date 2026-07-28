public class Myclass {
    int x;
    Myclass(){
        x=10;
    }
}
class ConsDemo{
    public static void main(String args[]){
        Myclass t1 = new Myclass();
        Myclass t2 =new Myclass();
        System.out.println(t1.x+" "+t2.x);
    }
}

