public class F03_Encapsulation {
    public static void main (String[] args){
        // The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
        // declare class variables/attributes as private
        // provide public get and set methods to access and update the value of a private variable
        // The get method returns the variable value, and the set method sets the value.

        Person p = new Person();
        // p.name = "Rakib"; --> Error
        p.setName("Rakib"); // Set the value of the name variable / method call
        System.out.println(p.getName());

        p.setAge(22); // Set the value of the age variable / method call
        System.out.println(p.getAge());

        BankAccount account = new BankAccount();
        account.deposit(5000.00);
        System.out.println(account.getBalance());
    }
}
class Person {
    private String name;
    private int age;
    // Getter
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    // Setter
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int newAge){
        age = newAge;
    }
}
class BankAccount {
    private double balance;
    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}