class Abc{
    int a,b;
    Abc(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("This is constructor");
    }
    void add(){
        System.out.println(a+b);
    }
}

public class Constructor {
    public static void main(String[] args){
    
Abc A;//only declaration of object will not call constructor
A = new Abc(50,200);
A.add();//Now difition of object is done so it will automatically call constructor
    }
}
