//create getter/setter method to access private variable balance
public class Account{
    private int balance;                // Private variable
    protected String accHolder;        // Protected variable
    public String type_of_account;     // Public variable

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String args[]){
        Account obj1=new Account();
        System.out.println(balance.obj1);
    }
}
