package p15_encapsulation;

public class F04_Encapsulation_Practice3 {
    public static void main (String[] args){
        BankAccountt AC = new BankAccountt("Shawon", 25000.00);
        System.out.println("Name: " + AC.getAccountHolder() + " | Balance: " + AC.getBalance());
        AC.deposit(4500.00);
        System.out.println("Name: " + AC.getAccountHolder() + " | Balance: " + AC.getBalance());
        AC.withdraw(8450.00);
        System.out.println("Name: " + AC.getAccountHolder() + " | Balance: " + AC.getBalance());
    }
}
class BankAccountt{
    private String accountHolder;
    private double balance;
    BankAccountt(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid Initial balance.");
        }
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
           System.out.println("Invalid deposit amount.");
        }
        else{
            this.balance = balance + amount;
        }
    }
    public void withdraw(double W_ammount){
        if(W_ammount <= 0){
            System.out.println("Invalid withdraw ammount.");
        }
        else if(W_ammount > balance){
            System.out.println("Insufficient balance.");
        }
        else{
            this.balance = balance - W_ammount;
        }
    }
}