package scinterface;
interface Member{
    public void callback();
}
class Store{
    Member member[]=new Member[10];
    int count=0;
    void register(Member m){
        member[count++]=m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++)
            member[i].callback();
    }
}
class Customer implements Member{
    String name;
    Customer(String n){
        name=n;
    }
    @Override
    public void callback(){
        System.out.println("ok,I will visit,"+name);
    }
}
public class Scinterface {
 public static void main(String[] args) {
        // TODO code application logic here
        Store s=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
