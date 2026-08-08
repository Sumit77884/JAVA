package scinherit;
class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    public Account(String acc,String n,String add,String phno,String dob){
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo() {return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    public long getBalance(){return balance;}
    public void setAddress(String add){
        address=add;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
}
class SavingAccount extends Account
{
    public SavingAccount (String acc,String add,String n,String phno,String dob){
        super(acc,add,n,phno,dob);
        
        
    }
    public void deposit(long amt){
        balance +=amt;
    }
    public void withdraw(long amt){
        balance -=amt;
    }
}
class LoanAccount extends Account{
    public LoanAccount(String acc,String n,String add,String phno,String dob){
        super(acc,n,add,phno,dob);
        
    }
    public void payEMI(long amt){
        balance -=amt;
    }
    public void repay(long amt){
        if(balance ==amt)
            balance=0;
    }
}

public class Scinherit {

  
    public static void main(String[] args) {
        // TODO code application logic here
        LoanAccount l=new LoanAccount("","","","","");
        
        
    }
    
}
